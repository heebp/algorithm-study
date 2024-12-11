import java.io.*;
import java.util.*;

class Main {
    public static int upperBinarySearch(int start, int end, int target, int[] arr) {
        while (start < end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int lowerBinarySearch(int start, int end, int target, int[] arr) {
        while (start < end) {
            int mid = (start + end) / 2;

            if (target <= arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] nList = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            nList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nList);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            sb.append(upperBinarySearch(0, n, target, nList) - lowerBinarySearch(0, n, target, nList)).append(" ");
        }
        System.out.println(sb);
    }
}
