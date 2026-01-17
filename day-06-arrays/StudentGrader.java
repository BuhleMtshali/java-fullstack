//IMPORTING THE JAVA UTIL ARRAYLIST
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("====== 🎲 Grade List 📋 =====");
        char symbol;
        //STARTING THE MAIN LOOP
        String reTry = "yes";

        while (reTry.equalsIgnoreCase("yes")) {

            //STARTING A WHILE LOOP FOR USER TO ADD MORE GRADES
            String addMore = "yes";
            while (addMore.equalsIgnoreCase("yes")) {
                System.out.print("🧩 Enter a grade: ");
                double grade = input.nextDouble();
                grades.add(grade);
                //CLOSING THE LOOP
                System.out.print("🎰 Wanna add more grades? ");
                input.nextLine();
                addMore = input.nextLine();
            }
            //END OF THE LOOP for adding MORE GRADES


            System.out.println("======= 🐝 oHKAY List is in 🎮 ======");

            //LOOPING THROUGH THE ARRAY
            for(double grade : grades){
                if(grade >= 80){
                    symbol = 'A';
                    System.out.println("You got " + grade + "% in your module, you get a/an: " + symbol);
                } else if(grade >= 70){
                    symbol = 'B';
                    System.out.println("You got " + grade + "% in your module, you get a/an: " + symbol);
                } else if(grade >= 50){
                    symbol = 'C';
                    System.out.println("You got " + grade + "% in your module, you get a/an: " + symbol);
                } else {
                    symbol = 'C';
                    System.out.println("You got " + grade + "% in your module, you get a/an: " + symbol);
                }
            }

            System.out.print("🐝 Wanna calculate again (yes/no): ");
            reTry = input.nextLine();
        }

        
        input.close();
    }
}