import java.util.Scanner;
public class natural{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        int i,n;
        System.out.println("enter the number upto n");
        n=sc.nextInt();
        i=1;
        while(i<=n)
        {
            System.out.println(i);
            i=i+1;
        }
    }
    
}
