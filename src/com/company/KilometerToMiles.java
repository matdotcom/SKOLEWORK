package com.company;
import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {

        // laver scanneren i vores system
        Scanner input = new Scanner(System.in);

        // tekst til scanner
        System.out.print(" Indtast hvor mange mil du ønsker at konvertere ");
        int mil = input.nextInt();

        // Disse linjer laver udregningen
        double kilometer = 1.6;
        double resultat = mil * kilometer;

        // Printer resultatet i konsollen
        System.out.println(mil + " Omregnet til kilometer er " + resultat);

    }
}
