package com.zutorcid.Controller;

import com.zutorcid.Controller.Names;
import com.zutorcid.Controller.Search;
import com.zutorcid.Controller.Token;
import com.zutorcid.Path.GetContentDTO;
import com.zutorcid.Person.GetPersonData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;



@Controller
public class SearchController {


    Token myToken = new Token();
    String token = myToken.getToken();

    @GetMapping("/search")
    public String searchForm(Model model){

        model.addAttribute("search",new Search());
        return "search";
    }

    @PostMapping("/foundAuthors")
    public String aboutAuthors(@ModelAttribute Search search, HttpSession session){
        Names names = new Names();
        List<GetPersonData> allAuthors = new ArrayList<>();
        String expression = search.getExpression();
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
                .queryParam("q", expression)
                .build(true);
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);


        for (int i=0;i<orcidPath.getResult().size();i++)
        {
            allAuthors.add(names.getName(orcidPath.getResult().get(i).getOrcidIdentifier().getPath()));
        }
        String path="";
       session.setAttribute("authors",allAuthors);
        session.setAttribute("path", path);
        return "foundAuthors";
    }

    @PostMapping("/dataAboutAuthor")
    public String aboutMyAuthor(@ModelAttribute Search search, HttpSession session ) {
    String isitWotk = "dsdsa";
    isitWotk = search.getPath();
    session.setAttribute("dsa",isitWotk);

        return "dataAboutAuthor";
    }


    }
