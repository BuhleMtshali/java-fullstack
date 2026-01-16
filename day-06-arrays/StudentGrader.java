//IMPORTING THE JAVA UTIL ARRAYLIST
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("====== 🎲 Grade List 📋 =====");

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


        System.out.print("======= 🐝 oHKAY List is in 🎮 ======");
        
        //LOOPING THROUGH THE ARRAY
        for(double grade : grades){
            System.out.println(grade);
        }

        
        input.close();
    }
}