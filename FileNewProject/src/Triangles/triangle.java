/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangles;

import java.util.Scanner;

/**
 *
 * @author harry
 */
public class triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter all Sides of the triangle(enter one at a time: ");

        int side0 = myObj.nextInt();
        int side1 = myObj.nextInt();
        int side2 = myObj.nextInt();

        String result = "";

        if (side0 == side1 && side0 == side2) {
            result = "equilateral";
        } else if (side0 == side1 || side0 == side2 || side1 == side2) {
            result = "isosceles";
        } else {
            result = "scalene";
        }

        System.out.println(result);
    }

}
