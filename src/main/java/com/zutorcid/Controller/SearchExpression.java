package com.zutorcid.Controller;

import com.sun.net.httpserver.HttpServer;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SearchExpression {
    private String expression;
    public String getExpression() throws UnsupportedEncodingException {
        System.out.print("Wpisz co chcesz wyszukac: ");
        Scanner sc = new Scanner(System.in);
        expression = sc.nextLine();
        sc.close();

        //expression = URLEncoder.encode(expression, "UTF-8");
                
        return expression;
    }
}
