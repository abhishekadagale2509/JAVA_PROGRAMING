import java.util.*;
class Student{
private int id;
private String name;
private float sal;
private float per;
private int actualpaidfees;
private int disfees;


public void setName(String n)
{
name=n;
}
public String getName(){
return name;
}



public void setId(int i){
Id=i;
}
public int getId(){
return id;
}

public void setPer(int p){
per=p;
}
public int getId(String n){
return p;
}



public void setactualpaidfees(int f)
{
actualpaidfees =f;
}
public void getactualpaidfees(String n)
{
retun actualpaidfees;

}



}

class Discount{
Student stud;
void setstudent(Student st){
stud=st;

}
void checkdisc(int per){
if(per>60){
int tfee=stud.getactualpaidfees();
adisfees=tfees*30/100;
int needpay=tfee-adisfees;
stud.setactualpaidfees(needpay);
//stud.setdisfees(adisfees)
}
}
void show(){
System.out.printf(stud.getName()+stud.getId()+stud.get+stud.getactualpaidfees());
}

}
public class StudentApp{
public static void main(String args[]){

Student stt=new Student();
stt.setId(1);
stt.setName("ab");
stt.setPer(70);

stt.setactualpaidfees(1000);
Discount d=new Discount();
d.setstudent(s);
d.checkdisc(70);
d.show();

}
}