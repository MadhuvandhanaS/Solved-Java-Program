import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%3==0)
            System.out.println("The number is divisible by 3");
        else
            System.out.println("The number is not divisible by 3 and gives a remainder "+n%3);
        in.close();
    }
}
