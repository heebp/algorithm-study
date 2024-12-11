import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i < n + 1; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) {
                continue;
            }

            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
