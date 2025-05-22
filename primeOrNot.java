import java.util.*;
public class primeOrNot{
    public static void main(String args[]){
        int no;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        
        boolean flag=true;

        while(no!=0)
        {
            for(int i=2;i<no;i++)
            {
                if(no/i==0)
                {
                    flag=false;
                    break;


                }
            }
        }
        if(flag){
            System.out.println("no is prime");
        }
        else{
            System.out.println("no is not prime");
        }
    }
}