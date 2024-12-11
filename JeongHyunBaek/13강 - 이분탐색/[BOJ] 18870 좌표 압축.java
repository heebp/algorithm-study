import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nList = new int[n];
        int[] sortedNList = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            nList[i] = x;
            sortedNList[i] = x;
        }
        Arrays.sort(sortedNList);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int s : sortedNList) {
            if (!map.containsKey(s)) {
                map.put(s, rank);
                rank++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int num : nList) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}
