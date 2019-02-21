package com.zutorcid.Controller;

import com.zutorcid.Path.GetContentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;



@Controller
public class SearchController {

    private List<String> namesList;
    Names names = new Names();

    Token myToken = new Token();
    String token = myToken.getToken();

    @GetMapping("/search")
    public String searchForm(Model model){

        model.addAttribute("search",new Search());
        return "search";
    }

    @PostMapping("/foundResults")
    public String submitSearch(@ModelAttribute Search search){



        String expression = search.getExpression();
        System.out.println(expression);
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/search")
                .queryParam("Authorization", token)
                .queryParam("q", expression)
                .build(true);
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);


        for(int i=0;i<orcidPath.getResult().size();i++) {
            System.out.println(names.getName(orcidPath.getResult().get(i).getOrcidIdentifier().getPath()));
            namesList.add(names.getName(orcidPath.getResult().get(i).getOrcidIdentifier().getPath()));
            
        }
        System.out.println(namesList);
        search.setFoundElement(namesList);
        return "foundResults";
    }



}
