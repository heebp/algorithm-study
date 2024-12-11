import java.util.*;

class Main {
    public static boolean isDigit(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String pokemon = sc.next();
            map1.put(i, pokemon);
            map2.put(pokemon, i);
        }

        for (int i = 0; i < m; i++) {
            String str = sc.next();

            if (isDigit(str)) {
                System.out.println(map1.get(Integer.parseInt(str)));
            } else {
                System.out.println(map2.get(str));
            }
        }
    }
}
