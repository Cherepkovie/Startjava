public class Unicode {	
    public static void main(String[] args) {
        // Выведите в цикле символы кодировки Unicode в диапазоне [9398, 10178]. 
        // Если выводятся кракозябры, то [33, 126]
        int j = 33;
        for (char i = 33; i <= 126; i++) {
            System.out.println(j + "  " + i);
            j++;
        }
    }
}