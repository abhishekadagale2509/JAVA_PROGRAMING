import java.util.*;
public class primeno{


public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int no;
boolean flag=true;
no=sc.nextInt();

for(int i=2;i<no;i++){
if(no%i==0){
flag=false;
}
}
if(flag){

System.out.printf("prime");
}
else{

System.out.printf("not prime");
}
}}