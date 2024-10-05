import java.util.*;
public class table{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);


int no,res;
System.out.printf("entere no");
no=sc.nextInt();
for(int i=0;i<=10;i++){
 res=no*i;
System.out.printf("%d * %d ->%d\n",no,i,res);
}


}
}