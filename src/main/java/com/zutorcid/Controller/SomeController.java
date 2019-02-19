package com.zutorcid.Controller;

import com.zutorcid.Path.GetContentDTO;
import com.zutorcid.Works.Year;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.zutorcid.Path.*;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SomeController {

    @RequestMapping("/")
    public String index() throws UnsupportedEncodingException {



        //Token from txt file
        Token myToken = new Token();
        String token = myToken.getToken();

         //seyt years about articles
        Years.setYears();

        // expression to find
        SearchExpression myExpression = new SearchExpression();
        String expression = myExpression.getExpression();



        String worksWWholeString;

        // Path=orcid which i need to work with api
        List<String> paths = new ArrayList<String>();

        // full data about authors
        List<String> fullData = new ArrayList<String>();

        // putcodes = variable of single article, i need for connect with api
        List<String> putCodes = new ArrayList();


        // connect with api and get path,host

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
                .queryParam("q", expression)
                .build();
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);



        System.out.print(expression);
        System.out.println(orcidPath.getResult());
        if("https://pub.sandbox.orcid.org/v2.1/search?q=ma%C5%82achowski".equals(uriComponents.toUriString())   ){
            System.out.println("yaa");
        }
        else{
            System.out.println(uriComponents.toUriString());
        }
        // Add paths to the list
        for (int i=0;i<orcidPath.getResult().size();i++)
        {
            paths.add(orcidPath.getResult().get(i).getOrcidIdentifier().getPath().toString());
        }
        // Add names to the list
       Names names = new Names();
        for(int i=0;i< paths.size();i++) {
            fullData.add("Path: "+paths.get(i)+", Nazwa"+names.getName(paths.get(i)));
        }

        //System.out.print(fullData);

        GetWorks works = new GetWorks();



        //fullData.add("Nazwa: " + names.getName(paths.get(0))+", numer Orcid: "+paths.get(0) +", codes: " +works.getWorks(paths.get(0)));

        worksWWholeString = works.getWorks(paths.get(0));

        StringBuilder onecode = new StringBuilder();


        for(int i=0;i<worksWWholeString.length();i++){
            if(Character.isDigit(worksWWholeString.charAt(i))){
                onecode.append(worksWWholeString.charAt(i));
            }
            else if(worksWWholeString.charAt(i)==','){
                putCodes.add(onecode.toString());
                onecode.delete(0,onecode.length());
            }
        }
        String aboutOneArticle = "";
        Work work = new Work();
        for(int i=0;i<putCodes.size();i++){
            aboutOneArticle += work.workData(paths.get(0),putCodes.get(0)) + ", ";
        }

        //look for 0000-0003-4628-3678 to find works
        //relations 0000-0003-4243-1776  or hyeonwoo
        System.out.print(expression);
        return paths.toString();
    }
}
