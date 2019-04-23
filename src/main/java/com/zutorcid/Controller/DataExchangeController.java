package com.zutorcid.Controller;

import com.google.gson.Gson;
import com.zutorcid.Work.GetWork;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;


@RestController
public class DataExchangeController {


    @PostMapping("/findworks")
    public GetWork[] exchangeData(@RequestBody RequestData requestData, HttpSession session) throws IOException {

        GetWorks getworks = new GetWorks();
        float sec;

        Calendar calendarDateStart = Calendar.getInstance();
        calendarDateStart.setTime(requestData.dateStart);
        Calendar calendarDateEnd = Calendar.getInstance();
        calendarDateEnd.setTime(requestData.dateEnd);
        List<Integer> putCodes = getworks.getWorks(requestData.orcid,calendarDateStart.get(Calendar.YEAR), calendarDateEnd.get(Calendar.YEAR));



        GetWork[] myWorks = new GetWork[putCodes.size()];
        long startTime = System.nanoTime();
        int i=0;
        for (Integer putCode : putCodes) {
            myWorks[i]=(Work.workData(requestData.orcid, putCode.toString()));
            i++;
        }
        long estimatedTime= System.nanoTime() - startTime;
        sec = estimatedTime/1000000;
        FileWriter testFile = new FileWriter("testPobieraniaPrac.txt", true);
        BufferedWriter write = new BufferedWriter(testFile);
        write.write(myWorks.length + "," + sec/1000 + "," + sec/myWorks.length + ";"  + "\n");
        write.close();

        Gson gson = new Gson();
        String  worksJson = gson.toJson(myWorks);
        String requestJson = gson.toJson(requestData);

        FileWriter requestFile = new FileWriter("request.json", true);
        BufferedWriter requestWrite = new BufferedWriter(requestFile);
        requestWrite.write(requestJson + "\n");
        requestWrite.close();

        FileWriter worksFile = new FileWriter("works.json", true);
        BufferedWriter worksWriter = new BufferedWriter(worksFile);
        worksWriter.write(worksJson+"\n");
        worksWriter.close();

        allWorks();

        return  myWorks;
    }

    @RequestMapping("/works")
    public String allWorks() throws IOException {

        FileReader requestReader = new FileReader("request.json");
        System.out.println(requestReader);

        return "works";
    }



}
