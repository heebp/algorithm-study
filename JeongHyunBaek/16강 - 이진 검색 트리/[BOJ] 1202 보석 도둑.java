import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] jewel = new int[n][2];
        int[] bags = new int[k];

        for (int i = 0; i < n; i++) {
            jewel[i][0] = sc.nextInt();
            jewel[i][1] = sc.nextInt();
        }
        Arrays.sort(jewel, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        for (int i = 0; i < k; i++) {
            bags[i] = sc.nextInt();
        }
        Arrays.sort(bags);

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long totalValue = 0;

        for (int i = 0, j = 0; i < k; i++) {
            while (j < n && jewel[j][0] <= bags[i]) {
                pq.offer(jewel[j++][1]);
            }

            if (!pq.isEmpty()) {
                totalValue += pq.poll();
            }
        }
        System.out.println(totalValue);
    }
}
