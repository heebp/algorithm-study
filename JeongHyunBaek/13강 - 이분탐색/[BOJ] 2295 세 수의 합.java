import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nList = new int[n];

        for (int i = 0; i < n; i++) {
            nList[i] = sc.nextInt();
        }
        Arrays.sort(nList);

        int[] twoSum = new int[n * (n + 1) / 2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                twoSum[index++] = nList[i] + nList[j];
            }
        }
        Arrays.sort(twoSum);

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arrays.binarySearch(twoSum, nList[i] - nList[j]) > - 1) {
                    maxValue = Math.max(maxValue, nList[i]);
                }
            }
        }
        System.out.println(maxValue);
    }
}
