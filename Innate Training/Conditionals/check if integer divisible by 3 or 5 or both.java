import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if(n%3==0 && n%5==0)
            System.out.println("HiHello");
        else if(n%3==0)
            System.out.println("Hi");
        else
            System.out.println("Hello");
        in.close();
    }
}
