package com.company;
import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // gør at programmet scanner efter et input, i den her omgang er det antal fahrenheit

        System.out.print(" Indtast hvor mange grader Fahrenheit: ");

        double fahrenheit = input.nextDouble();

        // konverterer fahrenheit til celcius
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " Er " + celcius + " Celcius. ");
    }
}
