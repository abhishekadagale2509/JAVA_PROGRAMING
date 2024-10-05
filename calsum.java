import java.util.*;
public class calsum
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
int no,rem,sum=0;
System.out.printf("enter no");
no=sc.nextInt();

while(no!=0){
rem=no%10;
no=no/10;
sum=sum+rem;

}
System.out.printf("%d",sum);

}}