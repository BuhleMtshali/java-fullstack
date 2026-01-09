import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("====== 🎲Mini Grade Checker 🐝 ======");
        String playAgain = "yes";
        //STARTING LOOP
        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.print("Loop is running....");


            //CLOSING THE LOOP
            System.out.println("🎰 Do you want to Calculate Again(yes/no): ");
            playAgain = input.nextLine();
        }


        System.out.println("===== 🧩 THANK YOU FOR TRYING MY GRADE CHECKER 🐝 ======");
        //CLOSING THE INPUT
        input.close();
    }
}
