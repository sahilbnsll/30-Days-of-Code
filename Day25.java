import java.util.*;

public class Solution
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int flag =0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int number) {

        double numberSqrt = Math.sqrt(number);

        if (number <= 1)
            return false;

        else {
            for (int j = 2; j <= numberSqrt; j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}

