import java.util.*;
public class TwoDarray{
public static void main(String args[])
{
int a[][]=new int[3][3];
Scanner sc=new Scanner(System.in);
System.out.printf("enter val");
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
a[i][j]=sc.nextInt();

}System.out.printf("\n");

}

System.out.printf("display enter val");
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){

System.out.printf("%d",a[i][j]);
}
System.out.printf("\n");
}

}

}