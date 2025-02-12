import java.util.Scanner;

public final class HalloumiBoxes {
    private static String solve(int[] arr, int n, int k) {
        if (k >= 2) return "YES";

        if (k == 1) {
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    return "NO";
                }
            }

            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(arr, n, k));
        }
    }
}
