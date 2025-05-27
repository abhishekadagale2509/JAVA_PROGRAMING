import java.util.*;
class Add{
    private int s=0;
    void calsum(int...x){
        for(int i=0;i<x.length;i++){
            s=s+x[i];

        }
        System.out.printf("%d",s);
    }
}
public class VariableArg{
    public static void main(String args[]){
        Add ad=new Add();
        ad.calsum(10,60,40,50,30);
    }
}