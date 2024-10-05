import java.util.*;
public class ProLoss{


public static void main (String args[]){
Scanner sc=new Scanner (System.in);

int sp,cp;

System.out.printf("enter cp and sp");
sp=sc.nextInt();
cp=sc.nextInt();

if(sp>cp){

System.out.printf("you got profit");
}else{
System.out.printf("you got loss");
}
}

}