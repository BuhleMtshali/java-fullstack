class Calculator{
    public static double add(double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2){
        double sum = num1 - num2;
        return sum;
    }

    public static double multiplay(double num1, double num2){
        double sum = num1 * num2;
        return sum;
    }

    public static double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("‼️ We cannot divide by 0");
            return 0;
        }
        return num1 / num2;
    }
}



public class CalculatorMethods {
    public static void main(String[] args){
        System.out.print("hello");
    }
}
