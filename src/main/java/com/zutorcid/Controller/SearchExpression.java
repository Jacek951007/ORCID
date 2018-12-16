package com.zutorcid.Controller;

import java.util.Scanner;

public class SearchExpression {
    private String expression;
    public String getExpression(){
        System.out.print("Wpisz co chcesz wyszukac: ");
        Scanner sc = new Scanner(System.in);
        expression = sc.nextLine();

        return expression;
    }
}
