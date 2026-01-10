import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("====== 🎲Mini Grade Checker 🐝 ======");
        String playAgain = "yes";
        //STARTING LOOP
        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.print("Please Enter the Name of your Module 📖: ");
            String moduleName = input.nextLine();
            System.out.print("🎲 Whaat was the Overall Mark of the test: ");
            Double overallMark = input.nextDouble();
            System.out.print("What was your Mark ⛳️: ");
            Double studentMark = input.nextDouble();

            //FINDING THE STUDENT MARK
            Double studentPercentage = (studentMark / overallMark) * 100;
            System.out.println("Your Overall Mark: " + studentPercentage);

            //CLOSING THE LOOP
            System.out.println("🎰 Do you want to Calculate Again(yes/no): ");
            input.nextLine();
            playAgain = input.nextLine();
        }


        System.out.println("===== 🧩 THANK YOU FOR TRYING MY GRADE CHECKER 🐝 ======");
        //CLOSING THE INPUT
        input.close();
    }
}
