import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;
public class buffered {
    public static void main(String args[])throws IOException{
        int a,b,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number:");
        a=Integer.parseInt(br.readLine());
        System.out.println("enter second number:");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("addition="+c);
    }
    
}
