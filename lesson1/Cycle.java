public class Cycle {	
    public static void main(String[] args) {
        // Печать цифр от 1 до 20 c for         
        for (int i = 0; i <= 20; i++) {
           System.out.println(i);     
        }
        System.out.println(" ");

        //  Печать цифр от 6 до -6 с while
        int step = 6;
        while (step >= -6) {
            System.out.println("ordinary step  " + step);
            step -= 2;
        }

        // Cумма нечетных чисел от 10 до 20 с do  while
        int j = 10;
        int sum = 0;
        do { 
            j++;
            if (j % 2 != 0 ) {
                sum += j;  
            }
        } while(j < 20);
        System.out.println("        Sublimation        ");
        System.out.println("SUM = " + sum);
    }
}   