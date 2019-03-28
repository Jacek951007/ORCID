package com.zutorcid.Controller;

import com.zutorcid.Employments.GetEmployments;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class Employments {

    public static GetEmployments getEmployments(String path) {
        Token myToken = new Token();
        String token = myToken.getToken();


        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/" + path + "/employments")
                .queryParam("Authorization", token)
                //   .queryParam("Accept", "application/json")

                .build(true);
         GetEmployments employmentSummary = new RestTemplate().getForObject(uriComponents.toUriString(), GetEmployments.class);

        return employmentSummary;
    }
}
