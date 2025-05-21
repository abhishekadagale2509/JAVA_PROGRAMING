import java.util.*;
public class InputFromScanner{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
String name;
int id;
System.out.printf("enter Details");
name=sc.nextLine();
id=sc.nextInt();
System.out.printf("show details");
System.out.printf("%s\t %d\t",name,id);

}
}