import java.util.*;
class conovr{
    conovr(int x){
        System.out.printf("%d",x*x);
    


    }
    conovr(float y){
        System.out.printf("%f",y*y);
    }
}
public class constructorOverloading{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        conovr c=new conovr(5);

    }
}