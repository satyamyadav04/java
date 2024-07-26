import java.util.Scanner;
public class evenorodd {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        if(a%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
    
}
