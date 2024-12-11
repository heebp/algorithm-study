import java.util.*;

class Main {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static int solve(int m, int n, int x, int y) {
        if (x == m) {
            x = 0;
        }

        if (y == n) {
            y = 0;
        }

        int l = lcm(m, n);

        for (int i = x; i <= l; i += m) {
            if (i == 0) {
                continue;
            }
            
            if (i % n == y) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(solve(m, n, x, y));
        }
    }
}
