import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if (number <= 1) {
            System.out.println(0);
            return;
        }
        if (number % 2 == 0) {
            System.out.println(2);
            return;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(number);
    }
}
