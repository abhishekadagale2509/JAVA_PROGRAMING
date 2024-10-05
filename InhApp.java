import java.util.*;

class value{
 int a,b;
void setval(int x,int y){

a=x;
b=y;

}
}


class Add extends value{
void showadd(){

System.out.printf("%d\n",a+b);
}

}
class Mul extends value{

void showMul(){
System.out.printf("%d\n",a*b);
}
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