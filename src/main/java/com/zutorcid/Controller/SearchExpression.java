package com.zutorcid.Controller;

import java.util.Scanner;

public class SearchExpression {
    private String expression;
    public String getExpression(){
        System.out.print("Wpisz co chcesz wyszukac: ");
        Scanner sc = new Scanner(System.in);
        expression = sc.nextLine();
        sc.close();

        expression = expression.replaceAll("ł","%C5%82");
        expression = expression.replace(" ","%20");
        //expression.replaceAll("ą","%c4%85");

        return expression;
    }
}
