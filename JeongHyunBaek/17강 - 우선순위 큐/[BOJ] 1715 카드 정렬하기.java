import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextInt());
        }

        while (pq.size() != 1) {
            int first = pq.poll();
            int second = pq.poll();

            int sumValue = first + second;
            result += sumValue;
            pq.offer(sumValue);
        }
        System.out.println(result);
    }
}
