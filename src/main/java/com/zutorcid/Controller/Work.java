package com.zutorcid.Controller;

import com.zutorcid.Work.GetWork;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;

public class Work {

    public static GetWork workData(String path, String putcode) throws IOException {
        Token myToken = new Token();
        String token = myToken.getToken();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/" + path + "/works/" + putcode)
                .queryParam("Authorization", token)
                .build(true);
         GetWork orcidWork = new RestTemplate().getForObject(uriComponents.toUriString(), GetWork.class);


        return orcidWork;
    }
}
