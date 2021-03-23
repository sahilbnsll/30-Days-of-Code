import java.util.*;

public class Day07 {
   private static final Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
         
        int n = sc.nextInt();
        
        int[] arr = new int[n];
     
     for(int i=0; i<n; i++)
     {
         arr[i]=sc.nextInt();
     }
     for(int s=n-1; s>=0; s--){
         System.out.print(arr[s]);
         System.out.print(" ");
     }
    }
}
