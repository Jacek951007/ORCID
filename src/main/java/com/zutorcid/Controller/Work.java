package com.zutorcid.Controller;

import com.zutorcid.Path.GetContentDTO;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class Work {

    public static String workData(String path, String putcode) {
    String s="";

        Token myToken = new Token();
        String token = myToken.getToken();


        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.sandbox.orcid.org").path("/v2.1/" + path + "/works/" + putcode)
                .queryParam("Authorization", token)
                //   .queryParam("Accept", "application/json")

                .build(true);
        GetContentDTO orcidPath = new RestTemplate().getForObject(uriComponents.toUriString(), GetContentDTO.class);

        return s;
    }
}
