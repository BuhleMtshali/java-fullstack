import java.util.Scanner;

public class OperatorPlayground {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String runAgain = "yes";
        int option;

        //STARTING THE WHILE LOOP
        while (runAgain.equalsIgnoreCase("yes")) {
            System.out.println("===== Operator Playground 🎮 =====");
            System.out.println("1. Arithmetic Operations🧮");
            System.out.println("2. Comparison Check👾");
            System.out.println("3. Logical Decision Test🧩");
            System.out.println("4. Exit🚫");
            System.out.print("Choose an option from above: ");

            //ASKING IF WE WANT TO RERUN THE LOOP OR NOT
            System.out.print("Woud you like to Rerun the program?(yes/no): ");
            input.nextLine();
            runAgain = input.nextLine();
        }

        System.out.println("==== Thank you for Trying the Program🧩 ====");
        input.close();
    }
}
