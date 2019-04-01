package com.zutorcid.Controller;

import com.zutorcid.Work.GetWork;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@RestController
public class DataExchangeController {

    @PostMapping("/findworks")
    public ResponseEntity<List<GetWork>> exchangeData(@RequestBody RequestData requestData) {

        GetWorks getworks = new GetWorks();
        Calendar calendarDateStart = Calendar.getInstance();
        calendarDateStart.setTime(requestData.dateStart);


        Calendar calendarDateEnd = Calendar.getInstance();
        calendarDateEnd.setTime(requestData.dateEnd);
        List<Integer> putCodes = getworks.getWorks(requestData.orcid,calendarDateStart.get(Calendar.YEAR), calendarDateEnd.get(Calendar.YEAR));
        List<GetWork> myWorks = new ArrayList<>();
        for (Integer putCode : putCodes) {
            myWorks.add(Work.workData(requestData.orcid, putCode.toString()));
        }

        return new ResponseEntity<>(myWorks,
                HttpStatus.OK);

    }
}
