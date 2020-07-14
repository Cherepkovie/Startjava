public class Calculator {	
    public static void main(String[] args) {
        int digit1 = 245;
        int digit2 = 9;
        int stepen = 4;
        int modul = 0;
        long result = 0L;
        char znakOperac = '/';
        System.out.println(" ");
        if (znakOperac =='+') {
            result = digit1 + digit2;
            System.out.println("Addition " + digit1 + " and " + digit2 + " = " + result);
        }

        if (znakOperac =='-') {
           result = digit1 - digit2;
           System.out.println("Subtraction " + digit1 + " and " + digit2 + " = " + result);
        }

        if (znakOperac =='/') {
            result = digit1 / digit2;
            System.out.println("Division " + digit1 + " and " + digit2 + " = " + result);
        }

        if (znakOperac =='*') {
            result = digit1 * digit2;
            System.out.println("Multiplication " + digit1 + " and " + digit2 + " = " + result);
        }

        if (znakOperac =='^') {
           int i = 1;
           result = 1;
              do {
                 i ++;
                 result *= digit1;
              } while (i <= stepen);
           System.out.println("Vozvesti " + digit1 + " v stepen " + stepen + " = " + result);
        }

        if (znakOperac =='%') {
            result = digit1 % digit2;
            System.out.println("Delenije po modulu  " + digit1 + " and " + digit2 + " = " + result);
        } 
        System.out.println("  ");
    }
}   