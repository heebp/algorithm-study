import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int end = 0;
        int minValue = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) {
            while (end < n && arr[end] - arr[start] < m) {
                end++;
            }
            
            if (end == n) {
                break;
            }
            
            minValue = Math.min(minValue, arr[end] - arr[start]);
        }
        System.out.println(minValue);
    }
}
