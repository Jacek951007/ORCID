package com.zutorcid.Controller;

import com.zutorcid.Path.GetContentDTO;
import com.zutorcid.Person.GetPersonData;
import com.zutorcid.Works.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class GetWorks {
    public String getWorks(String path) {

        Token myToken = new Token();
        String token = myToken.getToken();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/" + path + "/works")
                .queryParam("Authorization", token)
                .build(true);
       GetAllWorks ws = new RestTemplate().getForObject(uriComponents.toUriString(), GetAllWorks.class);
    ws.getGroup().get(00);
        String someWorkData = ws.getGroup().get(0).getWorkSummary().get(0).getPutCode().toString();

        return someWorkData;
    }
}
