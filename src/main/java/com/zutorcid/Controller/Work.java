package com.zutorcid.Controller;

import com.zutorcid.Work.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class Work {

    public static GetWork workData(String path, String putcode) {
    String wholeDataAboutWork;

        Token myToken = new Token();
        String token = myToken.getToken();

        List<String> contributors = new ArrayList<>();

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https").host("pub.orcid.org").path("/v2.1/" + path + "/works/" + putcode)
                .queryParam("Authorization", token)
                //   .queryParam("Accept", "application/json")

                .build(true);
         GetWork orcidWork = new RestTemplate().getForObject(uriComponents.toUriString(), GetWork.class);

//        wholeDataAboutWork = "Tytuł:" + orcidWork.getBulk().get(0).getWork().getTitle().getTitle().getValue().toString() +
//         ", Krótki opis: " + orcidWork.getBulk().get(0).getWork().getShortDescription() +
//         ", DOI: " + orcidWork.getBulk().get(0).getWork().getExternalIds().getExternalId().get(0).getExternalIdValue()+ " dane"
//                + orcidWork.getBulk().get(0).getWork().getType().toString();
//
//
//         for (int i=0;i<orcidWork.getBulk().get(0).getWork().getContributors().getContributor().size();i++) {
//             if(orcidWork.getBulk().get(0).getWork().getContributors().getContributor().isEmpty()) {
//                 contributors.add(orcidWork.getBulk().get(0).getWork().getContributors().getContributor().get(i).getContributorOrcid().getPath());
//             }
//         }
//
//        for(int i=0;i<contributors.size();i++) {
//            Names name = new Names();
//           wholeDataAboutWork+= ", Współautor/współautorzy: " +name.getName(contributors.get(i));
//        }
//



//        return wholeDataAboutWork.toString();
        return orcidWork;
    }
}
