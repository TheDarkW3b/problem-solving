import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n + 2];

            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            arr[n + 1] = x;

            int maxFuelRequired = Integer.MIN_VALUE;

            for (int i = 1; i <= n; i++) {
                maxFuelRequired = Math.max(maxFuelRequired, Math.abs(arr[i - 1] - arr[i]));
            }

            maxFuelRequired = Math.max(maxFuelRequired, 2 * Math.abs(arr[arr.length - 2] - arr[arr.length - 1]));
            System.out.println(maxFuelRequired);
        }
    }
}
