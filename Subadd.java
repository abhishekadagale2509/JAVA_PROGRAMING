import java.util.*;
public class Subadd{
public static void main (String args[]){
int agg,sub1,sub2,sub3,sub4,sub5,sub6;
Scanner sc=new Scanner(System.in);
System.out.printf("ENtere sub marks");



sub1=sc.nextInt();
sub2=sc.nextInt();
sub3=sc.nextInt();
sub4=sc.nextInt();
sub5=sc.nextInt();
sub6=sc.nextInt();



 agg=sub1+sub2+sub3+sub4+sub5+sub6;
int result =agg/6;

if(result>40)
{
System.out.printf("result pass");
}
else{
System.out.printf("result fail");}
}}