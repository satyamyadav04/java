// writwe a program to create a simple calculator (using switch case)
import java.util.Scanner;
public class switchcase{
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
        switch(ch)
        {
            case 1:
            System.out.println("addition="+(a+b));
            break;
            case 2:
            System.out.println("subtraction="+(a-b));
            break;
            case 3:
            System.out.println("multyply="+(a*b));
            break;
            case 4:
            System.out.println("Divide="+(a/b));
            break;
            default:
            System.out.println("invalid choice");
            
            
        }
    }
    }
