// writwe a program to create a simple calculator 
import java.util.Scanner;
public class simple {
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the secons number");
        b=sc.nextInt();
        System.out.println("enter the choice 1->Add 2->subtract 3->multiply 4->divide");
        ch=sc.nextInt();
        if(ch==1)
        System.out.println("Addition="+(a+b));
        else if(ch==2)
        System.out.println("subtraction="+(a-b));
        else if(ch==3)
        System.out.println("multiplication="+(a*b));
        else if(ch==4)
        System.out.println("divided="+(a/b));
        else
        System.out.println("invalid choice");
    }
    }