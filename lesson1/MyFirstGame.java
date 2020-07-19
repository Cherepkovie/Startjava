public class MyFirstGame {	
    public static void main(String[] args) {
        // компьютер "загадывает" целое число от (0 до 100], которое вам необходимо угадать
        int playerNum = 90;
        int hiddenNum = 85;
        int left = 0;
        int right = 100;
        int deltaNum = playerNum-hiddenNum;
        System.out.println(" ");
        System.out.println("Input number between  " + left + "  and  " + right);
        System.out.println(" ");
        while (playerNum != hiddenNum) {
            System.out.println("Your number is   " + playerNum + "   You didn't guess");
            System.out.println(" ");
            if (playerNum > left && hiddenNum >= playerNum) {
                left = playerNum;
            } else if (playerNum >= hiddenNum && right > hiddenNum) {
                right = playerNum; 
            }
            deltaNum = playerNum-hiddenNum;
                if (deltaNum >0) {
                    playerNum = playerNum-1;
                }
                else if (deltaNum<0) {
                    playerNum = playerNum+1;
                }
                System.out.println("Input number between  " + left + "  and  " + right);
        }
        System.out.println("You are right   " + hiddenNum);
        System.out.println(" ");
    }
}   