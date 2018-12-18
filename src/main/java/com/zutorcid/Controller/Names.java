package com.zutorcid.Controller;

import com.zutorcid.Person.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class Names {
    public String getName(String path){

        Token myToken = new Token();
        String token = myToken.getToken();

        UriComponents uriComponent = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/"+path+"/person")
                .queryParam("Authorization", token)
                .build(true);
        GetPersonData orcidData = new RestTemplate().getForObject(uriComponent.toUriString(), GetPersonData.class);


        String names = orcidData.getName().getGivenNames().getValue().toString()+" "+orcidData.getName().getFamilyName().getValue().toString();




        return names;
    }

}
