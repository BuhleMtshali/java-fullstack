import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("what is your name?");
        String name = input.nextLine();
        System.out.print(name);
    }
}