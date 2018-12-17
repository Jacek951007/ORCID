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
    List<String> paths = new ArrayList<String>();
        StringBuilder oneOrcidIdentifier = new StringBuilder();


      /* UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
             //   .queryParam("Accept", "application/json")
                .queryParam("q", expression)
                .build(true);
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);


        for (int i=0;i<orcidPath.getResult().size();i++)
        {
            oneOrcidIdentifier.append("Path: " + orcidPath.getResult().get(i).getOrcidIdentifier().getPath()+"\n");
            paths.add(oneOrcidIdentifier.toString());
            oneOrcidIdentifier.delete(0,oneOrcidIdentifier.length());
        }
        String firstPath = paths.get(0);
        firstPath.replaceAll("\\s+","");*/

       UriComponents uriComponent = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/0000-0002-3738-0938/person")
                .queryParam("Authorization", token)
                .build(true);
        GetPersonData orcidData = new RestTemplate().getForObject(uriComponent.toUriString(), GetPersonData.class);

       System.out.print(orcidData.getName().getFamilyName().toString());

        String onePath = orcidData.getName().getFamilyName().getValue();

        return onePath;
    }
}

