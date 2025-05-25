import java.util.*;
public class ReverseNo{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int no,rev=0;
        no=sc.nextInt();
        System.out.printf(" no before swap %d",no);
        while(no!=0){

            int rem=no%10;
            no=no/10;
            rev=rev*10+rem;


        }
        System.out.printf("no after swap %d",rev);

    }
}