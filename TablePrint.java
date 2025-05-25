import java.util.*;
public class TablePrint{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no;
        no=sc.nextInt();
        for(int i=0;i<=10;i++){
            int tab=no*i;
            System.out.printf("%d*%d-> %d\n",no,i,tab);
        }
    }
}
