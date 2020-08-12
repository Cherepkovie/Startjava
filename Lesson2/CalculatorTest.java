import java.util.Scanner;

public class CalculatorTest {	
    public static void main(String[] args) {
        Calculator1 calcOne = new Calculator1();

        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 1-е  число: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        System.out.println ("Введите знак операции: ");
        char sign = k.next().charAt(0);
        System.out.println ("Введите 2-е число: ");
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.print(number1 + number2);//выводит сумму number1 + number2

        System.out.println("\nsign " + calcOne.getSign());
        System.out.println("number1  " + calcOne.getNumber1());
        System.out.println("number2  " + calcOne.getNumber2());

        calcOne.setSign(sign);
        calcOne.setNumber1(number1);
        calcOne.setNumber2(number2);

        System.out.println("\nsign " + calcOne.getSign());
        System.out.println("number1  " + calcOne.getNumber1());
        System.out.println("number2  " + calcOne.getNumber2());
    }
}