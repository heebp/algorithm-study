import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        long[] kList = new long[k];

        for (int i = 0; i < k; i++) {
            kList[i] = sc.nextLong();
        }

        long start = 1;
        long end = Arrays.stream(kList).max().getAsLong();

        while (start < end) {
            long mid = (start + end + 1) / 2;
            long cnt = 0;

            for (int i = 0; i < k; i++) {
                cnt += kList[i] / mid;
            }

            if (cnt >= n) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
    }
}
