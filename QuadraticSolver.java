import java.util.*;
public class QuadraticSolver{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Quadratic solver!");
        System.out.println("Enter in a number for A: ");
        double a = input.nextDouble();
        System.out.println("Enter in a number for B: ");
        double b = input.nextDouble();
        System.out.println("Enter in a number for C: ");
        double c = input.nextDouble();

        double discrim = Math.sqrt(Math.pow(b,2) - (4*a*c));
        double answer1 = ((-1) * b + discrim)/ (2 *a);
        double answer2 = ((-1) * b - discrim)/(2*a);

        System.out.println("The answers are: " + answer1 + " and " + answer2);

    }
}