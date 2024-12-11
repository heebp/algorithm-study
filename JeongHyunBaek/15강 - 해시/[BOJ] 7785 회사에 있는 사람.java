import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(sc.next(), sc.next());
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("enter".equals(entry.getValue())) {
                list.add(entry.getKey());
            }
        }

        list.sort(Collections.reverseOrder());

        for (String name : list) {
            System.out.println(name);
        }
    }
}
