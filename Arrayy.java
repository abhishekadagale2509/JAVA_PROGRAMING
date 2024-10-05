import java.util.*;
public class Arrayy{
public static void main (String args[]){

int a[],i;

a=new int[5];
Scanner sc=new Scanner(System.in);
System.out.printf("entere the val of arr");
for( i=0;i<a.length;i++)
{
a[i]=sc.nextInt();

}
System.out.printf("display the val of arr");
for( i=0;i<a.length;i++)

{
System.out.printf("a[%d]\t %d\n",i,a[i]);

}

}
}