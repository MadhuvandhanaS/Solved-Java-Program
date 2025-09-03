import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        float d = (float)a/b;
        System.out.printf(a+" / "+ b+" = %.6f%n",d);
        System.out.println(a+" % "+ b+" = "+(a%b));
    }
}
