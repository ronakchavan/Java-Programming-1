
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.print("Type the radius:");
        int radius = Integer.parseInt(reader.nextLine());
        
        double circum = 2*Math.PI*radius;
        String toPrint = "Circumference of the circle: " + circum;
        System.out.println(toPrint);
               
    }
}
