import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("Pre increment:"+ ++n1);
        System.out.println("Post increment:" + n2++);
        System.out.print("Final values:"+ n1 +" "+ n2);
    }
}
