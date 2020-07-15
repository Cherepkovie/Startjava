public class Calculator {	
    public static void main(String[] args) {
        int number1 = 25;
        int number2 = 3;
//        int stepen = 4;
        int modul = 0;
        long result = 0L;
        char sign = '^';
        System.out.println(" ");
        if (sign == '+') {
            result = number1 + number2;
            System.out.println("Addition " + number1 + " and " + number2 + " = " + result);
        }

        else if (sign == '-') {
           result = number1 - number2;
           System.out.println("Subtraction " + number1 + " and " + number2 + " = " + result);
        }

        else if (sign == '/') {
            result = number1 / number2;
            System.out.println("Division " + number1 + " and " + number2 + " = " + result);
        }

        else if (sign == '*') {
            result = number1 * number2;
            System.out.println("Multiplication " + number1 + " and " + number2 + " = " + result);
        }

        else if (sign == '^') {
           int i = 1;
           result = 1;
              do {
                 i ++;
                 result *= number1;
              } while (i <= number2);
           System.out.println("Vozvesti " + number1 + " v stepen " + number2 + " = " + result);
        }

        else if (sign == '%') {
            result = number1 % number2;
            System.out.println("Delenije po modulu  " + number1 + " and " + number2 + " = " + result);
        } 
        System.out.println("  ");
    }
}   