import java.util.Scanner;

public class TimesTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to see its times table: ");
        int number = scanner.nextInt();

        System.out.println("Times table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

