import java.util.*;

class Main {
    public static boolean binarySearch(int start, int end, int target, int[] arr) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nList = new int[n];

        for (int i = 0; i < n; i++) {
            nList[i] = sc.nextInt();
        }
        Arrays.sort(nList);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();

            if (binarySearch(0, n - 1, target, nList)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
