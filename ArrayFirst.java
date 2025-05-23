import java.util.*;
public class ArrayFirst{
    public static void main (String args[]){
        int a[];
        a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("show val");
        for(int i=0;i<a.length;i++){
            System.out.printf("%d",a[i]);
        }
    }
}