import java.util.Scanner;
class add{
   public static void main(String args[])
   {
      int a,b,c;
      try (Scanner sc = new Scanner(System.in)) {
         System.out.println("enter first number:");
         a=sc.nextInt();
         System.out.println("enter the second number:");
         b=sc.nextInt();
      }
      c=a+b;
      System.out.println("Addition="+c);

   }
}