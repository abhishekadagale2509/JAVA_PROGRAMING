import java.util.*;
class Employee{
    private int id;
    private String name;

    public void setid(int  i){
        id=i;

    }
    public int getid(){
        return id;

    }
    public void setname(String n){
        name=n;

    }
    public String getname(){
        return name;

    }
}
public class PojoClass{
    public static void main(String args[]){
        Employee e=new Employee();
        e.setid(1);
        e.setname("Ab");

        System.out.printf("name is %s\n",e.getname());
        System.out.printf("id is %d\n",e.getid());    }
}