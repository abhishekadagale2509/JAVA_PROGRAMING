import java.util.*;
class value{
private int a,b;
public void setval(int x,int y){

a=x;
b=y;

}
}
class 

class Add extends value{

public void showadd(){

System.out.printf("%d",a+b);
}

}
class Mul extends value{

public void showMul(){
System.out.printf("%d",a*b);}
}
public class InhApp{
public static void main(String args[]){
Add ad=new Add();
ad.setval(10,20);
ad.showadd();

Mul m=new Mul();
m.setval(20,30);
m.showMul();
}

}