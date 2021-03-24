import java.util.*;
import java.io.*;

class Day08{
    public static void main(String[] argh){
         Map<String,Integer> callBook = new HashMap<String,Integer>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
        callBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer phoneNumber= callBook.get(s);
            if(callBook.containsKey(s)){
                System.out.println(s+"="+callBook.get(s));
            }
            else {
                 System.out.println("Not found");
                  }
            
        }
        in.close();
    }
}

