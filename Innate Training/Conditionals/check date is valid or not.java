import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.next();
        String da[] = date.split("/");
        
        int d = Integer.parseInt(da[0]);
        int m = Integer.parseInt(da[1]);
        int y = Integer.parseInt(da[2]);
        if((m==1 ||m==3 || m==5 || m==6|| m==8||m==10||m==12)&&(d>=1 && d<=31))
            System.out.println("Valid");
        else if((m==4||m==7||m==9||m==11) && (d>=1 && d<=30))
            System.out.println("Valid");
        else if(m==2 && ((y%400==0 && y%100==0)||y%4==0)){ 
            if(d>=1 && d<=29)
                System.out.println("Valid");}
        else
            System.out.println("Invalid");
    }
}
