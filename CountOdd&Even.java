import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, ce=0, co=0, n = in.nextInt();
        int[] a = new int[n];
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]%2==0){
                ce++;
        }
            else
                co++;
        }
        System.out.println("Odd = "+co);
        System.out.println("Even = "+ce);
    }
}
