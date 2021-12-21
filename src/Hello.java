import java.util.Scanner;

/***
 * Project Description:
 *
 * This project is to greet people. User has to input their name <NAME> and system has to greet them saying Namaste <NAME>
 *     Input: NAME
 *     output: Namaste Name
 *
 * Application should ask for input from user. Input should be taken in text from command line while running the application
 */


public class Hello {

    public static void main(String...args){

        // Java Input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.print("Namaste "+ name + "!");
        //System.out.print("Namaste \n"+ name + "!");
        //System.out.print("Namaste \n");
        //System.out.print(name + "!");
        //System.out.println("Namaste");
        //System.out.print(name + "!");



    }

}
