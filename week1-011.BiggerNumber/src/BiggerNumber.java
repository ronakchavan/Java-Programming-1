
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        int num2 = Integer.parseInt(reader.nextLine());
        
        int result = Math.max(num1, num2);
        
        String toPrint = "The bigger number of the two numbers given was: "+ result;
        System.out.println(toPrint);
    }
}
