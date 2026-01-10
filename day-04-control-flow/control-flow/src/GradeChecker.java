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
            char symbol;

            //IF STATEMENT FOR SYMBLE
            if(studentPercentage >= 90){
                symbol = 'A';
            } else if(studentPercentage >= 80){
                symbol = 'B';
            } else if(studentPercentage >= 70){
                symbol = 'C';
            } else if(studentPercentage >= 50){
                symbol = 'D';
            } else if(studentPercentage <= 49){
                symbol = 'F';
            }

            System.out.println("==== 👾 Summary 🎲 ====");
            System.out.println("🎮 Module Name: " + moduleName);
            System.out.println("🐝 Overall Module Mark: " + overallMark);
            System.out.println("🙋🏻‍♀️ Student Mark: " + studentMark);
            System.out.println("👯‍♀️ Student percentage: " + studentPercentage + "%");

            //CLOSING THE LOOP
            System.out.print("🎰 Do you want to Calculate Again(yes/no): ");
            input.nextLine();
            playAgain = input.nextLine();
        }


        System.out.println("===== 🧩 THANK YOU FOR TRYING MY GRADE CHECKER 🐝 ======");
        //CLOSING THE INPUT
        input.close();
    }
}
