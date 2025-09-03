import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int gp=0;
        while(n%2==0){
            gp=2;
            n/=2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                gp=i;
                n=n/i;
            }
        }
        if(n>2)
            gp = n;
        System.out.println(n);
    }
}
