import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        for (int i = 1; i <= k; i++) {
            result /= i;
        }
        
        for (int i = 1; i <= n - k; i++) {
            result /= i;
        }
        System.out.println(result);
    }
}
