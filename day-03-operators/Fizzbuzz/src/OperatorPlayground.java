import java.util.Scanner;

public class OperatorPlayground {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String runAgain = "yes";

        //STARTING THE WHILE LOOP
        while (runAgain.equalsIgnoreCase("yes")) {
            System.out.print("hello");


            //ASKING IF WE WANT TO RERUN THE LOOP OR NOT
            System.out.print("Woud you like to Rerun the program?(yes/no): ");
            input.nextLine();
            runAgain = input.nextLine();
        }

        System.out.println("==== Thank you for Trying the Program🧩 ====");
        input.close();
    }
}
