//IMPORTING THE JAVA UTIL ARRAYLIST
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("====== 🎲 Grade List 📋 =====");

        String addMore = "yes";
        while (addMore.equalsIgnoreCase("yes")) {
            

            //CLOSING THE LOOP
            System.out.print("🎰 Wanna add more grades? ");
            input.nextLine();
            addMore = input.nextLine();
        }


        System.out.print("======= 🐝 oHKAY List is in 🎮 ======");
        input.close();
    }
}