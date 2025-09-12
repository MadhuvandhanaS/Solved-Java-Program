import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = Math.max(num1, num2);
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println(lcm);
                break;
            }
            lcm += max;
        }
    }
}
