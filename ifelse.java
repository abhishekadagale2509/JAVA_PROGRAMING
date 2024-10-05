import java.util.Scanner;
public class ifelse {
    public static void main (String args[]){
    //int age=5;
    //if(age>18){
    //   System.out.println("you are elible for voting");
    //
    //else{
    //   System.out.println("you are not eligible for voting");
    //
    Scanner sc=new Scanner(System.in);
    System.out.println("enetere age  ");
    int age=sc.nextInt();
    
    System.out.println( "entere age is"+age);
if(age>18){
    System.out.println("you are eligible for voting");

}
else{
    System.out.println("your are not eligible");
}
    }
}
