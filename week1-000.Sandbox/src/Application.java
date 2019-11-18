
import java.util.Scanner;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        int num2 = Integer.parseInt(reader.nextLine());
        
        double result = (double)num1 / num2;
        
        String toPrint = "Division of the numbers: "+ num1 + "/" + num2 + " = " + result;
        System.out.println(toPrint);

    }
}
