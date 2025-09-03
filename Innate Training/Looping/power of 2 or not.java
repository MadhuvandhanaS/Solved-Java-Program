import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n > 0 && (n & (n - 1)) == 0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
