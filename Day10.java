import java.util.*;
public class Day10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int ones=0;
        int a=0;
        while (n>0){
            int remainder = n%2;
            n= n/2;
            if (remainder == 1) {
                a++;
                if (a > ones) {
                    ones = a;
                }
            }
                else
                {
                    a=0;
                }
                

            }
        System.out.println(ones);
    }

    }


