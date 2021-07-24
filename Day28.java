import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k=0;
        String[] names = new String[n];
        String regex = ".@gmail\\.com$";

        Pattern p = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String firstName = sc.next();
            String emailID = sc.next();

            Matcher m = p.matcher(emailID);

            if(m.find()){
                names[k++] = firstName;
            }
        }
        String name2[] =  new String[k];

        System.arraycopy(names, 0, name2, 0, k);
        Arrays.sort(name2);

        for(int i=0;i<name2.length;i++){
            System.out.println(name2[i]);
        }
    }
}

