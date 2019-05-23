package com.zutorcid.Controller;

import com.zutorcid.Work.GetWork;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;


@RestController
public class DataExchangeController {


    @PostMapping("/findworks")
    public GetWork[] exchangeData(@RequestBody RequestData requestData) throws IOException {
        GetWorks getworks = new GetWorks();

        Calendar calendarDateStart = Calendar.getInstance();
        calendarDateStart.setTime(requestData.dateStart);
        Calendar calendarDateEnd = Calendar.getInstance();
        calendarDateEnd.setTime(requestData.dateEnd);


        List<Integer> putCodes;

        putCodes = getworks.getWorks(requestData.orcid,calendarDateStart.get(Calendar.YEAR), calendarDateEnd.get(Calendar.YEAR));



        GetWork[] myWorks = new GetWork[putCodes.size()];
        int i=0;
        for (Integer putCode : putCodes) {
            myWorks[i]=(Work.workData(requestData.orcid, putCode.toString()));
            i++;
        }

        return  myWorks;
    }


}




