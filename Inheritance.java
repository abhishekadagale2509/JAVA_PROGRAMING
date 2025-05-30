import java.util.*;
class A{
    int m=10;

}
class B extends A{
    int n=20;

}
public class Inheritance{
    public static void main(String args[]){
        B b=new B();
        System.out.printf("m is %d ",b.m);
        System.out.printf("n is %d",b.n);

    }
}