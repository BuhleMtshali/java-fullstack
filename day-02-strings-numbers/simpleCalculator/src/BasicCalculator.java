
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //HERE WE DEFINE THE CHOICE VARIABLE
        String choice = "yes";
        Double output;

        //OUR LOOP RUNS FROM HERE WE CHECK IF THE USER INPUTED YES/NO
        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("---- Welcome to My Mini Calculator🧮 ----");

            //GETTING THE FIRST Number
            System.out.print("Enter your first number: ");
            Double firtNumber = input.nextDouble();

            System.out.print("Choose an operator: (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Enter your second number: ");
            Double secondNumber = input.nextDouble();

            //STARTNG SWITCH STATEMENTS
            switch (operator) {
                case '+':
                    output = firtNumber + secondNumber;
                    System.out.println("Output: " + output);
                    break;
                case '-':
                    output = firtNumber - secondNumber;
                    System.out.println("Output: " + output);
                    break;

                case '*':
                    output = firtNumber * secondNumber;
                    System.out.println("Output: " + output);
                    break;
                    
                case '/':
                    if(secondNumber != 0){
                        output = firtNumber / secondNumber;
                        System.out.println("Output: " + output);
                    } else{
                         System.out.print("Cannot devide by 0!!");   
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;

            
            }

            System.out.print("do you want to run again(yes/no): ");
            input.nextLine(); //CLEARS THE BUFFER
            choice = input.nextLine();
        }

        System.out.print("Program has ended!");
        input.close();
    }
}