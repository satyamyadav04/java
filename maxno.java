
import java.util.Scanner;
public class maxno {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number a");
        a=sc.nextInt();
        System.out.println("enter the number b");
        b=sc.nextInt();
        System.out.println("enter the number c");
        c=sc.nextInt();
        if((a>b)&&(a>c))
                System.out.println("max number="+a);
                if((b>a)&&(b>c))
                System.out.println("max number="+b);

                else
         System.out.println("max number="+c);
    }
}
