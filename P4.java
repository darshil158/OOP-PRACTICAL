/* AIM :-
Develop a Java application that calculates a person's Body Mass Index (BMI). The program should
ask the user for their weight in pounds and height in inches. Convert these values to kilograms and
meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and then calculate BMI
(weight in kg / (height in meters)^2). Display the calculated BMI. */



import java.util.*;
public class P4 {
    public static void main(String[] args) {
        double p,i;
        Scanner SC = new Scanner (System.in);
        System.out.print("ENTER WEIGHT IN POUNDS :- ");
        p=SC.nextDouble();
        System.out.print("ENTER HEIGHT IN INCHES :- ");
        i=SC.nextDouble();
        double kg = p * 0.45359237;
        double m = i * 0.0254;
        double bmi = kg / ( m * m);
        System.out.println("WEIGHT IN KILOGRAMS:- "+(p*0.45359237));
        System.out.println("HEIGHT IN METERS :- "+(i*0.0254));
        System.out.println("BMI OF A PERSON :- "+bmi);
    }
}
