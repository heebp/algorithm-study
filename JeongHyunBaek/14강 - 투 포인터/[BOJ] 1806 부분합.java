import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int end = 0;
        int total = arr[0];
        int minValue = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) {
            while (end < n && total < s) {
                end++;

                if (end != n) {
                    total += arr[end];
                }
            }

            if (end == n) {
                break;
            }
            minValue = Math.min(minValue, end - start + 1);
            total -= arr[start];
        }
        
        if (minValue == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minValue);
        }
    }
}
