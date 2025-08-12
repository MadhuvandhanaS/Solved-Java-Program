import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        char ch = in.nextLine().charAt(0);
        String s = in.nextLine();
        int flag =0;
        for(int i=0;i<s.length();i++){
            char check = s.charAt(i);
            if(ch==check){
                flag=1;
            }
        }
        if(flag==1)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
