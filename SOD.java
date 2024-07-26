import java.util.Scanner;
public class SOD {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("enter number");
        n=sc.nextInt();
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
         System.out.println("the sum of number"+sum);
        }
    }