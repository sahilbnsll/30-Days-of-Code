import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Return Date
        int D1 = sc.nextInt();
        int M1 = sc.nextInt();
        int Y1 = sc.nextInt();
        // Due Date
        int D2 = sc.nextInt();
        int M2 = sc.nextInt();
        int Y2 = sc.nextInt();

        int fine = 0;

        if (D2 >= D1 && M2 >= M1 && Y2 >= Y1) { fine = 0; }
        if (D1 >  D2 && M1 >  M2 && Y2 >  Y1) { fine = 0; }
        if (D1 >  D2 && M1 == M2 && Y1 == Y2) { fine = 15 * (D1 - D2); }
        if (M1 >  M2 && Y1 == Y2) { fine = 500 * (M1 - M2); }
        if (Y1 >  Y2) { fine = 10000; }
        System.out.println(fine);
    }
}

