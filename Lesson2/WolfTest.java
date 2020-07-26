public class WolfTest {	
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("\ndog " + wolfOne.gender);
        System.out.println("named  " + wolfOne.name);
        System.out.println("with durty colour " + wolfOne.colour);
        System.out.println("with age of  " + wolfOne.age  + "\n\n");
        wolfOne.go(); 
       System.out.println(wolfOne.howl() + "\n"); 
       System.out.println(wolfOne.hunting() + "\n\n\n\n\n");
    }
}