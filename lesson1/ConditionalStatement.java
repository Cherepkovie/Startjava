public class ConditionalStatement {	
    public static void main(String[] args) {
//        System.out.println("Hello, world");
        int age = 21;
        char maleGender = 'w';   /* половая принадлежность 'm' или 'w'*/
        float height = 1.6F;
        String firstNameLetter = "K";

        System.out.println(" ");
        if (age > 20) {
            System.out.println("Relevant age category");}

        if (maleGender != 'm') { 
            System.out.println("We need in man.You are not satisfied our conditions");}
        if (maleGender == 'm') {
            System.out.println("WELCOME");}

        if (height < 1.8) {
            System.out.println("Too smal guy  " + height);}
        else {
            System.out.println("OK  " + height);}

        if (firstNameLetter == "M") {
            System.out.println("Really M");}
        else if (firstNameLetter == "I") {
            System.out.println("Really I");}
        else {
            System.out.println("It is  not be really M or I  it is   " + firstNameLetter);} 
        System.out.println(" "); 
    }
}