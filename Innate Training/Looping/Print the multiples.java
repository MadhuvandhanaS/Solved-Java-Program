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
        for(int i=1;i<=m;i++){
            System.out.println(i+" * "+ n +" = "+i*n);
        }
    }
}
