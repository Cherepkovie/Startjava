public class WolfTest {	
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        System.out.println("\ndog " + wolfOne.getGender());
        System.out.println("named  " + wolfOne.getName());
        System.out.println("with durty colour " + wolfOne.getColour());
        System.out.println("with age of  " + wolfOne.getAge() + " years old\n\n");

        wolfOne.setGender("Bitch");
        wolfOne.setName("Limba");
        wolfOne.setColour("Brown");
        wolfOne.setAge(10);
        System.out.println("\ndog " + wolfOne.getGender());
        System.out.println("named  " + wolfOne.getName());
        System.out.println("with durty colour " + wolfOne.getColour());
        System.out.println("with age of  " + wolfOne.getAge() + " years old\n\n");

        wolfOne.go(); 
        System.out.println(wolfOne.howl() + "\n"); 
        System.out.println(wolfOne.hunting() + "\n\n\n\n\n");
        
    }
}