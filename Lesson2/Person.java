public class Person {

        String gender = "Man";
        String name = "Igor";
        float height = 1.81F;
        float weight = 92,8F;
        int age = 58;
        int speed = 5;
        highspeed = 10;

        int go() {
        System.out.println("Moving");
        return speed;
        }

        void sit() {
        System.out.println("Rest");
        }

        int run() {
        System.out.println("High speed moving");
        return highspeed;
        }

        boolean speak() {
        System.out.println("Speak English");
        return true;
        }

        string learning() {
        System.out.println("java learning");
        return "online";
        }
}