import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean threePairsExist = false;
            int emptyCount = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.' && i + 1 < n && s.charAt(i + 1) == '.' && i + 2 < n && s.charAt(i + 2) == '.') {
                    threePairsExist = true;
                }

                if (s.charAt(i) == '.') {
                    emptyCount++;
                }
            }

            System.out.println(threePairsExist ? 2 : emptyCount);
        }
    }
}
