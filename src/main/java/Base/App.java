/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package Base;


import java.util.Scanner;
public class App {
    static double CONV = 0.09290304;
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        String length = getDimension("length");
        String width = getDimension("width");
        double lengthNum = stringToDouble(length);
        double widthNum = stringToDouble(width);
        double areaImp = calcArea(lengthNum, widthNum);
        double areaMetric = impToMetric(areaImp);
        printOutput(lengthNum, widthNum, areaImp, areaMetric);
    }
    public static String getDimension(String dimension)
    {
        System.out.printf( "What is the %s of the room in feet ", dimension);
        String quote = in.nextLine();
        return quote;
    }

    public static double stringToDouble(String number)
    {
        return Double.parseDouble(number);
    }

    public static double calcArea(double length, double width)
    {
        return length * width;
    }

    public static double impToMetric(double imperial)
    {
        return imperial * CONV;
    }

    public static void printOutput (double length, double width, double areaImp, double areaMetric)
    {
        System.out.printf( "You entered dimensions of %.0f feet by %.0f feet.\nThe area is\n%.3f square feet\n" +
                "%.3f square meters", length, width, areaImp, areaMetric);
    }


}