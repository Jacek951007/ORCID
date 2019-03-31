package com.zutorcid.Controller;

import com.zutorcid.Employments.GetEmployments;
import com.zutorcid.Employments.Year;
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
import java.beans.Expression;
import java.util.ArrayList;
import java.util.Date;
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
                .build(false);
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
    public String aboutMyAuthor(@ModelAttribute Search search, HttpSession session) {

        Names names = new Names();
        Employments employments = new Employments();
        String path = search.getPath();
        List<String> emplo = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        GetPersonData dataAboutSelectedAuthor = names.getName(path);
        GetEmployments myEmployments = employments.getEmployments(path);
        session.setAttribute("aboutSelectedAuthor",dataAboutSelectedAuthor);
        if(myEmployments.getEmploymentSummary() != null){
            for(int i=0;i<myEmployments.getEmploymentSummary().size();i++){
                if(myEmployments.getEmploymentSummary().get(i).getOrganization().getAddress().getCity() != null){
                sb.append(myEmployments.getEmploymentSummary().get(i).getOrganization().getAddress().getCity() + ", ");
                }
                if(myEmployments.getEmploymentSummary().get(i).getOrganization().getName() != null){
                    sb.append(myEmployments.getEmploymentSummary().get(i).getOrganization().getName()+", ");
                }
                if(myEmployments.getEmploymentSummary().get(i).getDepartmentName() != null){
                    sb.append(myEmployments.getEmploymentSummary().get(i).getDepartmentName()+", ");
                }
                if(myEmployments.getEmploymentSummary().get(i).getStartDate() != null) {
                    sb.append(myEmployments.getEmploymentSummary().get(i).getStartDate().getYear().getValue() + ":" +
                            myEmployments.getEmploymentSummary().get(i).getStartDate().getMonth().getValue() + ":" +
                            myEmployments.getEmploymentSummary().get(i).getStartDate().getDay().getValue() + "-");
                    if (myEmployments.getEmploymentSummary().get(i).getEndDate() != null) {
                        sb.append(myEmployments.getEmploymentSummary().get(i).getEndDate().getYear().getValue() + ":" +
                                myEmployments.getEmploymentSummary().get(i).getEndDate().getMonth().getValue() + ":" +
                                myEmployments.getEmploymentSummary().get(i).getEndDate().getDay().getValue() + ".");
                    }
                    sb.append("present.");
                }
                emplo.add(sb.toString());
                sb.delete(0,sb.length());
            }
        }

        session.setAttribute("employment",emplo);
        return "dataAboutAuthor";
    }
    @PostMapping("/works")
    public String allWorks(@ModelAttribute Search search, HttpSession session){


        String path = search.getPath();
        System.out.println(path);
        Names names = new Names();
        String firstName= names.getName(path).getName().getGivenNames().getValue();
        CreateJSON cj = new CreateJSON();
        cj.JSON(firstName);

        String mydate = search.getWorksSince();
       // System.out.println(search.getWorksSince().toString());



        return "works";
    }


    }
