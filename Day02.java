  
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day02 {

    static void solve(double meal_cost, double tip_percent, double tax_percent) {
        double a = meal_cost;
        double b = (tip_percent/100 * a);
        double c = (tax_percent/100 * a);
        int total_cost = (int) Math.round (a+ b +c);
        System.out.println(total_cost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();
    }
}
