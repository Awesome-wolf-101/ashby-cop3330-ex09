/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        final int GallonCoverage = 350;
        System.out.println("What is the Length");
        Scanner sc = new Scanner(System.in);
        String Length = sc.nextLine();
        System.out.println("What is the Length");
        String Width = sc.nextLine();


        double LengthDouble = Double.parseDouble(Length);
        double WidthDouble = Double.parseDouble(Width);
        double FootageInt  = WidthDouble * LengthDouble;
        double GallonsNeeded = FootageInt / GallonCoverage;
        int GallonsNeededInt = (int) Math.ceil(GallonsNeeded);
        System.out.println("You will need to purchase " +  GallonsNeededInt + " gallons of paint to cover " + ( (int) WidthDouble * (int) LengthDouble) + " square feet.");




    }
}
