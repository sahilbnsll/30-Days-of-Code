import java.io.*;
import java.util.*;

public class Day06 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T= sc.nextInt();
    
    for(int i=0; i<=T-1; i++)
    {
        String S=sc.next();
        for(int j=0; j< S.length();j++){
            if(j%2==0){
                System.out.print(S.charAt(j));
            }
            
        }
        System.out.print(" ");
        for(int k=0;k<S.length();k++){
            if(k%2!=0){
                System.out.print(S.charAt(k));
            }
                }
                            System.out.println(""); //Line Change b/w Two Outputs

    }
        
}
}

