import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mul=0,n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.print(a[0]*a[1]+ " ");
        for(int i=1;i<n-1;i++){
            System.out.print(a[i-1]*a[i+1]+" ");
        }
        System.out.print(a[n-1]*a[n-2]+" ");
    }
}
