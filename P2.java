/* AIM :-
Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by =
e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate and display the
values of x and y using Cramer's rule. Include error handling for cases where the denominator is
zero Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D */



import java.util.*;
public class P2 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;
        Scanner SC = new Scanner (System.in);
        System.out.print("ENTER CO-EFFICIENT A :- ");
        a = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT B :- ");
        b = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT C :- ");
        c = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT D :- ");
        d = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT E :- ");
        e = SC.nextDouble();
        System.out.print("ENTER CO-EFFICIENT F :- ");
        f = SC.nextDouble();
        
        double D, Dx, Dy;
        D = (a*d) - (b*c) ;
        Dx = (e*d) - (b*f) ;
        Dy = (a*f) - (c*e) ;
        
        if(D == 0) {
            System.out.println("THIS SOLUTION HAS NO UNIQUE SOLUTION (D=0)");
        } 
        else {
            x = Dx / D ;
            y = Dy / D ;
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}
