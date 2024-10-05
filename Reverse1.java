import java.util.*;
public class Reverse1
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
int no,rem,rev=0;
System.out.printf("enter no");
no=sc.nextInt();

while(no!=0){
rem=no%10;
no=no/10;
rev=rev*10+rem;
}
System.out.printf("%d",rev);

}}