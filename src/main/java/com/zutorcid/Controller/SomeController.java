package com.zutorcid.Controller;

import com.zutorcid.Person.GetPersonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import com.zutorcid.Person.*;
@RestController
public class SomeController {

    @RequestMapping("/")
    public String index() {


    Token myToken = new Token();
    String token = myToken.getToken();

    String fullData;

    SearchExpression myExpression = new SearchExpression();
    String expression = myExpression.getExpression();
    List<String> paths = new ArrayList<String>();
        StringBuilder oneOrcidIdentifier = new StringBuilder();


       UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
             //   .queryParam("Accept", "application/json")
                .queryParam("q", expression)
                .build(true);
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);



        for (int i=0;i<orcidPath.getResult().size();i++)
        {
            oneOrcidIdentifier.append(orcidPath.getResult().get(i).getOrcidIdentifier().getPath());
            paths.add(oneOrcidIdentifier.toString());
           // paths.get(i).replace("\\s+","");
            oneOrcidIdentifier.delete(0,oneOrcidIdentifier.length());
        }





        String firstPath = paths.get(0);
        Names names = new Names();
        for(int i=0;i< paths.size();i++) {
            fullData = names.getName(paths.get(0));
        }


        return fullData;
    }
}

