import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day09 {
    static int factorial(int n) {
        int fact=1;
        for(int i=1; i<=n; i++){
        fact= fact*i;
        }
        return fact;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result=factorial(n);
        System.out.println(result);
    }
}
