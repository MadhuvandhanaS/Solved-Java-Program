import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0)
            System.out.println("Positive");
        else if(n==0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        in.close();
    }
}
