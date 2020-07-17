public class MyFirstGameCOPIA {	
    public static void main(String[] args) {
        int numMy = 0;
        int numComp = 85;
        int left = 0;
        int right = 100;
//        boolean isNum;
        int isNum = 1;
        int i = 1;
        System.out.println(" ");
        System.out.println("Input number between  " + left + "  and  " + right);
        System.out.println(" ");
//        isNum = (numMy-numComp == 0);
//        while (isNum != true) {
        while (isNum != 0) {
            if (i == 1) {numMy = 42;}
            if (i == 2) {numMy = 94;}
            if (i == 3) {numMy = 53;}
            if (i == 4) {numMy = 68;}
            if (i == 5) {numMy = 86;}
            if (i == 6) {numMy = 84;}
            if (i == 7) {numMy = 85;}
            i++;
            if (numMy > left && numComp >= numMy) {
                left = numMy;
            } else if (numMy >= numComp && right > numComp) {
                right = numMy; 
            }
            isNum = numMy-numComp;
            if (isNum != 0) {
                System.out.println("Your number is   " + numMy + "   You didn't guess");
                System.out.println("Input number between  " + left + "  and  " + right);
                System.out.println(" ");
            }  
        }
        System.out.println("You are right   " + numComp);
        System.out.println(" ");
    }
}   