import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string");
        if (input.nextLine() == "") {
            throw new RuntimeException("String must not be empty");
        }
    }
}