import java.util.*;

[2;2R[3;1R[>77;30406;0c]10;rgb:bfbf/bfbf/bfbf]11;rgb:0000/0000/0000public class Day21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int totalSwaps= 0;

        for(int i=0; i < n; i++) {
            a[i] = in.nextInt();
            for(int j=0;j < i;j++) {
                if (a[j] > a[i]) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                totalSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
