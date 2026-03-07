/* AIM :-
Develop a Java program that prompts the user to enter a distance in meters. Your program should
then convert this distance to feet (1 meter = 3.28084 feet) and display the result formatted to two
decimal places. */




import java.util.*;
public class P1 {
    public static void main(String args[]){
        int n;
        Scanner SC = new Scanner (System.in);
        System.out.print("ENTER DISTANCE IN METER :- ");
        n=SC.nextInt();
        float d;
        System.out.print("DISTANCE IN FEET :- "+(n*3.28084));
        d=SC.nextFloat();
        
    }
}


