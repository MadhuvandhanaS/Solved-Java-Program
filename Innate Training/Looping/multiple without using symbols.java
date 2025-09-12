import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int product = 0;
        for (int i = 0; i < Math.abs(n); i++) {
            product += m;
        }
        if (n < 0) {
            product = -product;
        }
        System.out.println(product);
    }
}
