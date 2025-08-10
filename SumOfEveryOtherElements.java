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
            s=s+a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(s-a[i]+" ");
        }
    }
}
