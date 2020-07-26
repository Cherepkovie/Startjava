public class Wolf {

        String gender = "male";
        String name = "Wolfy";
        float weight = 25.5F;
        int age = 5;
        String colour = "grey";
        int speed;
        int highspeed;

        int go() {
        System.out.println("Moving \n" );
        return speed;
        }

        void sit() {
        System.out.println("sit");
        }

        int run() {
        System.out.println("High speed moving");
        return highspeed;
        }

        boolean howl() {
        System.out.println("Instill fear");
        return true;
        }

        String hunting() {
        System.out.println("maintenance of life");
        return "endurance";
        }
}