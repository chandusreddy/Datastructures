package datastructures.classes;

public class CookieMain {

    public static void main(String[] args) {
        // using objects for with a constructor
        Cookie cookieone = new Cookie("Green");
        Cookie cookieTwo = new Cookie("Blue");
        // using the method of the class in the main method
        System.out.println(cookieone.getColor());
        System.out.println(cookieTwo.getColor());



    }
}
