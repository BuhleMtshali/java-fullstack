import java.util.Scanner;

public class MultiplationGenerator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("========= 🔢 Mini Multiplication Generator 🎲 =========");
        String generateAgain = "yes";

        while (generateAgain.equalsIgnoreCase("yes")) {
            System.out.print("🎮 Choose your multiplier(1-30) 🛍️: ");
            int multiplier = input.nextInt();

            //STARTING THE FOR LOOP
            for(int i = 1; i <= multiplier; i++){
                System.out.println(i + " * " + multiplier + " = " + (i * multiplier));
            }

            //CLOSING THE LOOP
            System.out.print("🎰 Do you want to regenarate another table: ");
            input.nextLine();
            generateAgain = input.nextLine();
        }

        System.out.println("======== ⛳️ THANK YOU FOR TRYING MY MULTIPLIPLICATION GENERATOR 🐝 =========");
        input.close();
    }
}
