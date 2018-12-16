package com.zutorcid.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SomeController {

    @RequestMapping("/")
    public String index() {
    Token myToken = new Token();
    String token = myToken.getToken();

    SearchExpression myExpression = new SearchExpression();
    String expression = myExpression.getExpression();

        StringBuilder oneOrcidIdentifier = new StringBuilder();


        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
             //   .queryParam("Accept", "application/json")
                .queryParam("q", expression)
                .build(true);
        GetContentDTO praca = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);
        for (int i=0;i<praca.getResult().size();i++)
        {
           oneOrcidIdentifier.append("Path: " + praca.getResult().get(i).getOrcidIdentifier().getPath()+"\n");


        }

        return oneOrcidIdentifier.toString();
    }
}

