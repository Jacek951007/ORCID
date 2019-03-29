package com.zutorcid.App;

import com.zutorcid.Controller.*;
import com.zutorcid.Path.GetContentDTO;
import com.zutorcid.Work.GetWork;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SomeController {

    @RequestMapping("/")
    public String index(HttpSession Session) throws UnsupportedEncodingException {



        //Token from txt file
        Token myToken = new Token();
        String token = myToken.getToken();

         //seyt years about articles
        Years.setYears();

        // expression to find
        SearchExpression myExpression = new SearchExpression();
        String expression = myExpression.getExpression();



        String worksWWholeString="";

        // Path=orcid which i need to work with api
        List<String> paths = new ArrayList<String>();

        // full data about authors
        List<String> fullData = new ArrayList<String>();

        // putcodes = variable of single article, i need for connect with api
        List<String> putCodes = new ArrayList();


        // connect with api and get path,host

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
                .queryParam("q", expression)
                .build(true);
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);


        // Add paths to the list
        for (int i=0;i<orcidPath.getResult().size();i++)
        {
            paths.add(orcidPath.getResult().get(i).getOrcidIdentifier().getPath().toString());
        }
        System.out.println(paths.toString());
        // Add names to the list
       Names names = new Names();
        for(int i=0;i< paths.size();i++) {
            fullData.add("Path: "+paths.get(i)+", Nazwa"+names.getName(paths.get(i)));
            System.out.println(fullData.get(i));
        }

        //System.out.print(fullData);

        GetWorks works = new GetWorks();
        System.out.println();
  //      for(int i=0;i<paths.size();i++) {

//}
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
        List<GetWork> allWorks = new ArrayList<>();
        Work work = new Work();
        for(int i=0;i<2;i++){
            allWorks.add(work.workData(paths.get(3),putCodes.get(1)));
            aboutOneArticle += work.workData(paths.get(3),putCodes.get(1)) + ", ";
        }

        Session.setAttribute("works",allWorks);
        //look for 0000-0003-4628-3678 to find works
        //relations 0000-0003-4243-1776  or hyeonwoo

        System.out.print(expression);
        return "foundResults";
    }
}