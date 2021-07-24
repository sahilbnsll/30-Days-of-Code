import java.util.*;

public class Problem_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int result = 0;

            for (int y = 0; y < n; y++) {
                for (int z = y + 1; z <= n; z++) {
                    int amp = y & z;
                    if (amp < k && amp > result)
                        result = amp;
                }
            }
            System.out.println(result);
        }
    }
}

