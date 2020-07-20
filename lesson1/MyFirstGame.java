public class MyFirstGame {	
    public static void main(String[] args) {
        // компьютер "загадывает" целое число от (0 до 100], которое вам необходимо угадать
        int playerNum = 2;
        int hiddenNum = 1;
        int left = 0;
        int right = 100;
        int deltaNum = playerNum-hiddenNum;

        System.out.println("\nInput number between  " + left + "  and  " + right + "\n");
        while (playerNum != hiddenNum) {
            System.out.println("Your number is   " + playerNum + "   You didn't guess\n");
            if (playerNum > left && hiddenNum > playerNum) {
                left = playerNum;
            } else if (playerNum > hiddenNum && right > hiddenNum) {
                right = playerNum; 
            }
            deltaNum = playerNum-hiddenNum;
            if (deltaNum > 0) {
                playerNum--;
            } else if (deltaNum < 0) {
                playerNum ++;
            }
            System.out.println("Input number between  " + left + "  and  " + right);
        }
        System.out.println("You are right   " + hiddenNum + "\n");
    }
}   