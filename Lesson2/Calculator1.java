public class Calculator1 {	
//    public static void main(String[] args) {
        private int number1 = 25;
        private int number2 = 3;
        private long result = 0L;
        private char sign = '^';
//        System.out.println("empty");

        
        public int getNumber1() {
        return number1;
        } 

        public void setNumber1(int number1) {
        this.number1 = number1;
        }

        public int getNumber2() {
        return number2;
        }   

        public void setNumber2(int number2) {
        this.number2 = number2;
        }

        public char getSign() {
        return sign;
        }

    public void setSign(char sign) {
        this.sign = sign;
    }

/*     int month = 8;
        String monthString;
/*        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;


            if (sign == '+') {
            result = number1 + number2;
            System.out.println("Addition " + number1 + " and " + number2 + " = " + result);*/

            switch (sign) {
            case '+': result = number1 + number2;
                System.out.println("Addition " + number1 + " and " + number2 + " = " + result);
            break;
            case '-': result = number1 - number2;
                System.out.println("Subtraction " + number1 + " and " + number2 + " = " + result);
            break;
            case '/': result = number1 / number2;
                System.out.println("Division " + number1 + " and " + number2 + " = " + result);
            break;
            case '*': result = number1 * number2;
                System.out.println("Multiplication " + number1 + " and " + number2 + " = " + result);
            break;
            case '%':  result = number1 % number2;
                System.out.println("Delenije po modulu " + number1 + " and " + number2 + " = " + result);
            break;
            case '^': int i = 1;
                      result = 1;
                        do {
                            i++;
                            result *= number1;
                        } while (i <= number2);
                System.out.println("Vozvesti " + number1 + " v stepen " + number2 + " = " + result);
            break;
            }
    }        


/*        } else if (sign == '-') {
            result = number1 - number2;
            System.out.println("Subtraction " + number1 + " and " + number2 + " = " + result);
        } else if (sign == '/') 
            result = number1 / number2;
            System.out.println("Division " + number1 + " and " + number2 + " = " + result);
        } else if (sign == '*') {
            result = number1 * number2;
            System.out.println("Multiplication " + number1 + " and " + number2 + " = " + result);
        } else if (sign == '^') {
            int i = 1;
            result = 1;
            do {
                i++;
                result *= number1;
            } while (i <= number2);
            System.out.println("Vozvesti " + number1 + " v stepen " + number2 + " = " + result);
        } else if (sign == '%') {
            result = number1 % number2;
            System.out.println("Delenije po modulu  " + number1 + " and " + number2 + " = " + result);
        } */

//        System.out.println("  ");

