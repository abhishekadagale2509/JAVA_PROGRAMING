import java.util.*;
public class palindrome
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
int no,rev=0,rem,temp;
System.out.printf("enter no");
no=sc.nextInt();
temp=no;
while(no!=0){
rem=no%10;
no=no/10;
rev=rev+100*rem;

rem=no%10;
no=no/10;
rev=rev+10*rem;

rem=no%10;
no=no/10;
rev=rev+1*rem;


}if(rev==no)
{System.out.printf("palindrome");
}
else{
System.out.printf("not palindrome");}

}}