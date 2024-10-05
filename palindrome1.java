import java.util.*;

public class palindrome1  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no, rev = 0, rem, temp;

        System.out.printf("Enter a number: ");
        no = sc.nextInt();
temp=no;
while(temp!=0){
rem=temp%10;

rev=rev*10+rem;

temp=temp/10;}
      if(rev==no){
System.out.printf("palin");
}
else{
System.out.printf("not palind");}
    }
}
