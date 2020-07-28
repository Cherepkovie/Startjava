public class Wolf {

    private String gender = "male";
    private String name = "Wolfy";
    private float weight = 25.5F;
    private int age = 5;
    private String colour = "grey";
    private int speed;
    private int highspeed;

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("\nAge is not correct\n");
        } else {
            this.age = age;
          }
    }

    public int go() {
        System.out.println("Moving \n" );
        return speed;
    }

    public void sit() {
        System.out.println("sit");
    }

    public int run() {
        System.out.println("High speed moving");
        return highspeed;
    }

    public boolean howl() {
        System.out.println("Instill fear");
        return true;
    }

    public String hunting() {
        System.out.println("maintenance of life");
        return "endurance";
    }
}