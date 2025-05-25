import java.util.*;
public class LowerToUpperCase{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch=<'z'){
            int ascii=(int)ch-32;
            ch=(char)ascii;


        }
        System.out.printf("%c",ch);
    }
}
