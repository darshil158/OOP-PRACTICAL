
/* AIM :-
Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the
area of the triangle. Ensure that the program validates if the given side lengths can actually form a
triangle (sum of any two sides must be greater than the third side) before calculating the area (use
Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2). */

import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("SUM OF ANY TWO SIDES IS GREATER THAN REMAINING LAST SIDE");
        
        double a, b, c, s, area;

        System.out.print("ENTER SIDE A :- ");
        a = sc.nextDouble();

        System.out.print("ENTER SIDE B :- ");
        b = sc.nextDouble();

        System.out.print("ENTER SIDE C :- ");
        c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("AREA OF TRIANGLE = " + area);
        } 
        else {
            System.out.println("THE GIVEN SIDES DO NOT FORM A VALID TRIANGLE.");
        }
    }
}
