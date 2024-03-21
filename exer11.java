public class Fibonacci {

    public static void main(String[] args) {
        int n = 15;
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            int next = first + second;

            if (next % 4 != 0) {
                System.out.print(next + " ");
            }

            if (next > 100) {
                break;
            }

            first = second;
            second = next;
        }
    }
}