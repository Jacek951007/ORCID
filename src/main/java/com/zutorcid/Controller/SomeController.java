package com.zutorcid.Controller;

import com.zutorcid.Path.GetContentDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.zutorcid.Path.*;
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
        List<String> fullData = new ArrayList<String>();
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
            oneOrcidIdentifier.delete(0,oneOrcidIdentifier.length());
        }

        Names names = new Names();
      /*  for(int i=0;i< paths.size();i++) {
            fullData.add(names.getName(paths.get(i)));
        }*/

      GetWorks works = new GetWorks();

        fullData.add("Nazwa: " + names.getName(paths.get(0))+", numer Orcid: "+paths.get(0) +", title: " +works.getWorks(paths.get(0)));


        //look for 0000-0003-4628-3678 to find works
        //relations 0000-0003-4243-1776  or hyeonwoo
        return fullData.toString();
    }
}

