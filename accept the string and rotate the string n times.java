import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int l = s.length();
        int n = k%l;
        String reversedString = s.substring(n)+ s.substring(0,n);
        System.out.println(reversedString);
    }
}
