
import java.util.Scanner;
public class sumandprodoct{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,pro=1,digit;
        System.out.println("enter the number");
        n=sc.nextInt();
        while(n>0)
        {   
            digit=n%10;
            if (digit%2==0)
            sum=sum+digit;
            else
            pro=pro*digit;
            n=n%10;
        }
        System.out.println("print the sum="+sum+"print the product="+pro);
    }
        }