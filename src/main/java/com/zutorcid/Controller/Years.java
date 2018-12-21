package com.zutorcid.Controller;

import java.util.Scanner;

public class Years {
    private static int firstYear;
    private static int secondYear;
    public static void setYears(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj rok od którego chciałbyś publikacje: ");
        firstYear = sc.nextInt();

        

        System.out.print("Podaj rok do którego chciałbyś publikacje: ");
        secondYear = sc.nextInt();
    }

    public static int getFirstYear() {
        return firstYear;
    }

    public static int getSecondYear() {
        return secondYear;
    }
}
