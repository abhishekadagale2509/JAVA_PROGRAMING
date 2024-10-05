import java.util.*;
public class Reverse{
public static void main (String args[])
{

Scanner sc=new Scanner (System.in);
int no,rem,rev=0;

System.out.println("entere no");
no=sc.nextInt();

rem=no%10;
no=no/10;
rev=rev+rem*100;


rem=no%10;
no=no/10;
rev=rev+rem*10;

rem=no%10;
no=no/10;
rev=rev+rem*1;

System.out.printf("%d",rev);

}}