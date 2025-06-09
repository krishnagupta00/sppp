public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 2 to 100:");

        for (int i = 2; i <= 100; i++) {
            int count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++; // i is divisible by j → not prime
                    break;
                }
            }

            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
