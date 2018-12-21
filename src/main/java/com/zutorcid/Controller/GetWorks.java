package com.zutorcid.Controller;

import com.zutorcid.Works.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class GetWorks {
    public String getWorks(String path) {

        Token myToken = new Token();
        String token = myToken.getToken();

        List<Integer> putCode = new ArrayList<>();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/" + path + "/works")
                .queryParam("Authorization", token)
                .build(true);
       GetAllWorks ws = new RestTemplate().getForObject(uriComponents.toUriString(), GetAllWorks.class);

       int yearStart = Years.getFirstYear();
       int yearEnd = Years.getSecondYear();

    for(int i=0;i<ws.getGroup().size();i++) {
       if(Integer.valueOf(ws.getGroup().get(i).getWorkSummary().get(0).getPublicationDate().getYear().getValue())>yearStart & Integer.valueOf(ws.getGroup().get(i).getWorkSummary().get(0).getPublicationDate().getYear().getValue())<yearEnd) {
           putCode.add(Integer.valueOf(ws.getGroup().get(i).getWorkSummary().get(0).getPutCode()));
        }
    }
    return putCode.toString();
    }
}
