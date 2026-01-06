import java.util.Scanner;

public class OperatorPlayground {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String runAgain = "yes";
        int option;
        Double output;
        

        //STARTING THE WHILE LOOP
        while (runAgain.equalsIgnoreCase("yes")) {
            System.out.println("===== Operator Playground 🎮 =====");
            System.out.println("1. Arithmetic Operations🧮");
            System.out.println("2. Comparison Check👾");
            System.out.println("3. Logical Decision Test🧩");
            System.out.println("4. Exit🚫");
            System.out.print("Choose an option from above: ");
            option = input.nextInt();

            //STARTING THE SWITCH LOOP
            switch (option) {
                case 1:
                    System.out.println("=== Arithmetic Operations🧮 ====");
                    System.out.print("Enter the first number: ");
                    Double firstNumber = input.nextDouble();
                    System.out.print("Choose an operator(+, -, *, /): ");
                    char operator = input.next().charAt(0);
                    System.out.print("Enter your second number: ");
                    Double secondNumber = input.nextDouble();
                    
                    if(operator == '+'){
                        output = firstNumber + secondNumber;
                        System.out.println("Output: " + output);
                    } else if(operator == '-'){
                        output = firstNumber - secondNumber;
                         System.out.println("Output: " + output);
                    } else if(operator == '*'){
                        output = firstNumber * secondNumber;
                         System.out.println("Output: " + output);
                    } else if(operator == '/'){
                        if(secondNumber != 0){
                            output = firstNumber / secondNumber;
                             System.out.println("Output: " + output);
                        } else {
                            System.out.print("🚫 Cannot devide by 0");
                        }
                    } else {
                        System.out.println("Invalid Operator🚫");
                    }
                    //END OF INNER SWITCH
                    break;
                
                case 2:
                    System.out.println("2. Comparison Check👾");
                    System.out.print("Enter the first number: ");
                    Double numberOne = input.nextDouble();
                    System.out.print("Enter the second number: ");
                    Double numberTwo = input.nextDouble();
                    if(numberOne > numberTwo){
                        System.out.println(numberOne + " Is greater than " + numberTwo);
                    } else if(numberOne < numberTwo){
                        System.out.println(numberOne + " Is lesser than " + numberTwo);
                    } else if(numberOne == numberTwo){
                        System.out.println(numberOne + " Is equal to " + numberTwo);
                    }
                    //END OF IFs
                    break;
                
                case 3:
                    System.out.println("3. Logical Decision Test🧩");
                    input.nextLine();
                    System.out.println("Enter your Name🙋🏻‍♀️: ");
                    String name = input.nextLine();
                    System.out.println("Enter your Age👾: ");
                    int age = input.nextInt();
                    if(age < 18){
                        System.out.println("🪪 Ooops too young to have an ID " + name);
                    } else if(age >= 18){
                        System.out.println("🎊Look who's old enough to own an ID its " + name);
                    } else{
                        System.out.println("🚫Ooops Invalid!!");
                    }
                    break;
                //END CASE 3

                case 4:
                    runAgain = "no";
                    System.out.println("==== Thank you for Trying the Program🧩 ====");
                    break; 

                default:
                    System.out.println("Invalid option selected🚫");
                    break;
            }

            //ASKING IF WE WANT TO RERUN THE LOOP OR NOT
            System.out.print("Woud you like to Rerun the program?(yes/no): ");
            input.nextLine();
            runAgain = input.nextLine();
        }

        System.out.println("==== Thank you for Trying the Program🧩 ====");
        input.close();
    }
}
