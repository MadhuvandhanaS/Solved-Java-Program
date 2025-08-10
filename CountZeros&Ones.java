import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int s=0,n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int zc=0,oc=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                zc++;
            else
                oc++;
        }
        System.out.println("zc = "+zc);
        System.out.println("oc = "+oc);
    }
}
