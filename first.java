import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int len,br,area,peri;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght");
        len=sc.nextInt();
        System.out.println("enter the breadth");
        br=sc.nextInt();
        area=len*br;
        peri=2*(len+br);
        System.out.println("area of rectangle="+area);
         System.out.println("perimeter of rectangle="+peri);
}
    
}

