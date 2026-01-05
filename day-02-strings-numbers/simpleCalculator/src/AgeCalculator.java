import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String choice = "yes";


        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("===== Welcome to my Mini Age Calculator👯‍♀️ =====");


            //GETTING THE USERSS Name
            System.out.println("Enter your Name: ");
            String name = input.nextLine();

            //BIRTHDAY DETAILS
            System.out.print("Enter your birthday year: ");
            int birthYear = input.nextInt();

            System.out.print("Enter your birth month (1-12): ");
            int birthMonth = input.nextInt();

            System.out.print("Enter your Birth date(1-31): ");
            int date = input.nextInt();

            //CREATING THE DATE OBJECT & current date
            LocalDate birthDate;
            try{
                birthDate = LocalDate.of(birthYear, birthMonth, date);
            } catch (Exception e){
                System.out.println("⚠️ Hmm... that date looks off. Try again maybe?");
                return;
            }

            //CALCULATING THE AGE
            



            System.out.print("Do you want to calculate Again?: ");
            choice = input.nextLine();
            
        }


        
        System.out.println("Thank you trying my Mini Age Calculator!!!");
        input.close();
    }
}
