package com.zutorcid.Controller;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.zutorcid.Person.GetPersonData;


public class Names {
    public GetPersonData getName(String path){

        Token myToken = new Token();
        String token = myToken.getToken();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/"+path+"/person")
                .queryParam("Authorization", token)
                .build(true);
        GetPersonData dataAboutAuthors = new RestTemplate().getForObject(uriComponents.toUriString(), GetPersonData.class);


     //   String names = dataAboutAuthors.getName().getGivenNames().getValue().toString()+" "+dataAboutAuthors.getName().getFamilyName().getValue().toString();


        return dataAboutAuthors;
    }

}
