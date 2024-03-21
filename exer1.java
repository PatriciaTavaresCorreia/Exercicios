import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        double average = (double) (number1 + number2 + number3) / 3; 

        System.out.println("The average of the three numbers is: " + average);
    }
}