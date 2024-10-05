import java.util.*;
public class Jaggedarray{
public static void main(String args[])
{
int a[][]=new int[3][];
    a[0]=new int[3];
a[1]=new int[4];
a[2]=new int[2];

Scanner sc=new Scanner(System.in);
System.out.printf("enter val\n");
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
a[i][j]=sc.nextInt();

}System.out.printf("\n");

}

System.out.printf("display enter val\n");
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){

System.out.printf("%d",a[i][j]);
}
System.out.printf("\n");
}

}

}