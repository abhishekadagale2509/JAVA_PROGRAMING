import java.util.*;
public class factorial
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
int no,i;
System.out.printf("entere no");
no=sc.nextInt();
int fact=1;
for(i=1;i<no;i++){

fact=fact*i;

}
System.out.printf("%d",fact);
}
}