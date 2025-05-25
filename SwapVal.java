import java.util.*;
public class SwapVal{
    public static void main(String args[]){
        int a,b;

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.printf("val before swap %d %d\n",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf(" after swap val's are %d %d",a,b);
    }
}