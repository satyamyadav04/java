import java.util.Scanner;
public class sumofnatural {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,add=0;
        System.out.println("enter value on N number");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            add=add+i;
            i=i+1;
        }
        System.out.println("sum of natural number is"+add);
    
    }
    
}
