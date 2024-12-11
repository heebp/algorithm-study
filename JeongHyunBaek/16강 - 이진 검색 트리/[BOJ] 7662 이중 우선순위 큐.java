import java.io.*;
import java.util.*;

class Main {
    public static int removeMap(Queue<Integer> queue, Map<Integer, Integer> map) {
        int num;

        while (true) {
            num = queue.poll();

            int cnt = map.getOrDefault(num, 0);

            if (cnt == 0) {
                continue;
            }

            if (cnt == 1) {
                map.remove(num);
            } else {
                map.put(num, cnt - 1);
            }
            break;
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            Queue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
            Queue<Integer> minPq = new PriorityQueue<>();

            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();

                if ("D".equals(str)) {
                    int n = Integer.parseInt(st.nextToken());

                    if (map.isEmpty()) {
                        continue;
                    }

                    Queue<Integer> pq = n == 1 ? maxPq : minPq;

                    removeMap(pq, map);
                } else {
                    int n = Integer.parseInt(st.nextToken());

                    map.put(n, map.getOrDefault(n, 0) + 1);
                    maxPq.offer(n);
                    minPq.offer(n);
                }
            }

            if (map.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                int value = removeMap(maxPq, map);
                System.out.println(value + " " + (map.isEmpty() ? value : removeMap(minPq, map)));
            }
        }
    }
}
