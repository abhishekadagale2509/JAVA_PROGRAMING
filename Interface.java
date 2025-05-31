import java.util.*;
interface A{
    void show();
}
interface B extends A{
    void display();
}
class C implements B{
    public void show(){
        System.out.println("i m show method");
 
    }
    public void dislpay(){
        System.out.println("i m from display method");
    }
}
public class Interface{
    public static void main(String args[]){
        C c1=new C();
        c1.show();
        c1.display();

    }
}