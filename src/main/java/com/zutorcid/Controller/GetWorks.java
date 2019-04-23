package com.zutorcid.Controller;

import com.zutorcid.Works.GetAllWorks;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

class GetWorks {
    public List<Integer> getWorks(String path, int yearStart, int yearEnd) {

        Token myToken = new Token();
        String token = myToken.getToken();


        List<Integer> putCode = new ArrayList<>();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/" + path + "/works")
                .queryParam("Authorization", token)
                .build(true);
        GetAllWorks allWorks;
        allWorks = new RestTemplate().getForObject(uriComponents.toUriString(), GetAllWorks.class);

        int workYear=0;

        assert allWorks != null;
        if(allWorks.getGroup() != null) {
             for(int i=0;i<allWorks.getGroup().size();i++){
                 if(allWorks.getGroup().get(i).getWorkSummary().get(0).getPublicationDate() != null && allWorks.getGroup().get(i).getWorkSummary().get(0).getPublicationDate().getYear() != null) {
                     workYear = Integer.parseInt(allWorks.getGroup().get(i).getWorkSummary().get(0).getPublicationDate().getYear().getValue());
                 }
                if (workYear >= yearStart && workYear <= yearEnd) {
                    putCode.add(allWorks.getGroup().get(i).getWorkSummary().get(0).getPutCode());
                }
             }
         }
        return putCode;
    }
}
