import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String choice = "yes";


        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("hello");


            System.out.print("Do you want to calculate Again?: ");
            choice = input.nextLine();
            
        }


        
        System.out.println("Thank you trying my Mini Age Calculator!!!");
        input.close();
    }
}
