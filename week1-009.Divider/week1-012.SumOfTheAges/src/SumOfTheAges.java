
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        
        System.out.print("Type your name:");
        String name1= reader.nextLine();
        System.out.print("Type your age:");
        int age1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name:");
        String name2= reader.nextLine();
        System.out.print("Type your age:");
        int age2 = Integer.parseInt(reader.nextLine());
        
        int result = age1 + age2;
        
        String toPrint = name1 + " and " + name2 + "are "  + result + " years old in total.";
        System.out.println(toPrint);
        
    }
}
