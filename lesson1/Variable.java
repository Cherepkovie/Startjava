public class Variable  {
    public static void main(String[] args) {
        byte size = 6; /* Gb  */
        char gb = 'g';
        int typeSystem = 64; /*  - разрядная система */
        float locDiskReserved = 70.7F; /* занято дисковой памяти */
        long totalSize = 239215648768L; /* емкость диска в байтах 
        */
        String markaPc = "Lenovo";
        String modelPc = "Ideapad"; 
        String processor = "Pentium(R) Dual-Core CPU T4500 @ 2300 GHz";
        System.out.println(" class Veriable was created. Huraaaaaaaah ! ");
        System.out.println("Программа Veriable создана. Уррраааа!");
        System.out.println("  ");
        System.out.println("  ");
        System.out.print(markaPc);
        System.out.print(" - ");
        System.out.println(modelPc);
        System.out.println(processor);
        System.out.print("Оперативная память  - ");
        System.out.print(size);
        System.out.print("  ");
        System.out.println(gb);
        System.out.print("Разрядность -  ");
        System.out.println(typeSystem);
        System.out.print("Заполненная память  - ");
        System.out.println(locDiskReserved);
        System.out.print("Общая память  - ");
        System.out.print(totalSize);
        System.out.print("  байт ");
    }
}