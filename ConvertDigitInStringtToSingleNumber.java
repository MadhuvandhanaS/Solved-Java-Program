import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int flag=1;
        for(int i=0;i<s.length();i++){
            char n = s.charAt(i);
            if(n>=48 && n<=57){
                System.out.print(n);
                flag=0;
            }
        }
        if(flag==1)
            System.out.println("0");
    }
}
