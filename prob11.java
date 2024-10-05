import java.util.*;

public class prob11 {
    public static void main (String args[]){
        System.out.println("the sum of three no is ");
        int a=1;
        int b=23;
        int c=2;
        int sum=a+b+c;
        System.out.println(sum);

        System.out.println("average of three no is ");
        float sub1=89;
        float sub2=56;
        float sub3=89;
        float sum1=(sub1+sub2+sub3)/30;

        System.out.println(sum1);


        System.out.println("what is your name");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str);


        Scanner sc1=new Scanner(System.in);
        System.out.println("entere intger no");
        System.out.println(sc1.hasNextInt());



    }
}
