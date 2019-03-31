package com.zutorcid.Controller;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;

public class CreateJSON {
    public String JSON(String name){

        JsonObject value = Json.createObjectBuilder()
                .add("Name",name)
                


                .build();
        System.out.println(value);
        return "a";
    }
}
