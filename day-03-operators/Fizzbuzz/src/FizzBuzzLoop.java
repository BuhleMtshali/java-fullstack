import java.util.Scanner;

public class FizzBuzzLoop {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       String runAgain = "yes";

       System.out.println("==== 🔐 FizzBuzz Mini Game 🧩 =====");
    
       //START OF THE LOOP
       while (runAgain.equalsIgnoreCase("yes")) {

        System.out.print("🎲 Enter your Max Iterator(1-30): ");
        int maxIterator = input.nextInt();

        if(maxIterator > 30){
            System.out.println("🦺 Too High for now friend🚫!!!");
        } else {
            for(int i = 0; i <= maxIterator; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("🎊FizzzBuzzz🎮!!");
            } else if(i % 3 == 0){
                System.out.println("🐝 Fizzzz!!");
            } else if(i % 5 == 0){
                System.out.println("🎰Buzz!!!");
            } else{
                System.out.println("⛳️Ooops " + i + " out of the bullpark on this one!! ");
            }
            }

        }

        //ASKING TO SEE IF THE LOOP RERUNS OR NOT
        System.out.print("Do you want to rerun the loop?(yes/no): ");
        input.nextLine();
        runAgain = input.nextLine();

       }

       System.out.print("Loop has ended!!");
       input.close();
    }
}
