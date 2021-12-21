import java.util.Scanner;

public class Sum {
    public static void main(String...arga){
        Scanner sc;
        sc= new Scanner(System.in);
        int a;
        int b;
        // variable declration
        // variable type and variable name

        // variable initialization -> Assigning value to variable
        System.out.println("Please enter first number");
        a = sc.nextInt();
        System.out.println("Please enter second number");
        b = sc.nextInt();

        int sum;
        sum = a+b;

        System.out.print("The sum of a= "+a+" and b= "+b+ " is: "+sum);


    }

}