import java.util.*;
public class QuadraticSolver{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What x? IDK let's figure that oud! Welcolme to the quad zone!");
        System.out.println("Enter in a number for A: ");
        double a = input.nextDouble();
        System.out.println("Enter in a number for B: ");
        double b = input.nextDouble();
        System.out.println("Enter in a number for C: ");
        double c = input.nextDouble();
        System.out.println("The quadratic formula is x = -b +- sqrt(b^2 - 4ac)/2a");
        double discrim = Math.sqrt(Math.pow(b,2) - (4*a*c));
        double answer1 = ((-1) * b + discrim)/ (2 *a);
        double answer2 = ((-1) * b - discrim)/(2*a);

        System.out.println("The answers are: " + answer1 + " and " + answer2);

    }
}