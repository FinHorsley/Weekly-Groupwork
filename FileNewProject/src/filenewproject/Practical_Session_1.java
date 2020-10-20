/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filenewproject;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author Harry Marsh
 */
public class Practical_Session_1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Length 1");

        String Length1 = myObj.nextLine();  // Read user input

        System.out.println("Enter Length 2");

        String Length2 = myObj.nextLine();  // Read user input

        System.out.println("Enter Length 3");

        String Length3 = myObj.nextLine();  // Read user input

        System.out.println("Lenght 1: " + Length1);  // Output user input
        System.out.println("Lenght 2: " + Length2);  // Output user input
        System.out.println("Lenght 3: " + Length3);  // Output user input
    }
}
