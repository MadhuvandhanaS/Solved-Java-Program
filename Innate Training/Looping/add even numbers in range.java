import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
