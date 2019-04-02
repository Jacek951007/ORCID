package com.zutorcid.Controller;

import com.zutorcid.Works.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class GetWorks {
    public List<Integer> getWorks(String path, int yearStart, int yearEnd) {

        Token myToken = new Token();
        String token = myToken.getToken();


        List<Integer> putCode = new ArrayList<>();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/" + path + "/works")
                .queryParam("Authorization", token)
                .build(true);
        GetAllWorks allWorks = new RestTemplate().getForObject(uriComponents.toUriString(), GetAllWorks.class);


        for (int i = 0; i < allWorks.getGroup().size(); i++) {
            /*if (Integer.valueOf(allWorks.getGroup().get(i).getWorkSummary().get(0).getPublicationDate().getYear().getValue())
                    >= yearStart && Integer.valueOf(allWorks.getGroup().get(i).getWorkSummary().get(0).getPublicationDate().getYear().getValue())
                    <= yearEnd) {*/
                putCode.add(Integer.valueOf(allWorks.getGroup().get(i).getWorkSummary().get(0).getPutCode()));
           // }
        }
        return putCode;
    }
}
