public class Fibonacci {

    public static void main(String[] args) {
        int n = 15;
        int first = 2;
        int second = 5;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
    