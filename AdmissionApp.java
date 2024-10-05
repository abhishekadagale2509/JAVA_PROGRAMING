import java.util.*;
class Student{
private int id;
private String name;
private float sal;


public void setId(int i)
{
id=i;
}
public int getId()
{
return id;
}

public void setName(String n)
{name=n;

}
public String getName(){
return name;
}

public void setSal(float s){
sal=s;
}
public float getSal(){
return sal;
}
}
class Admission{
Student stud;
void addNewadmission(Student student){
stud=student;
}
void show(){

System.out.printf(stud.getId()+"\t"+stud.getName()+"\t"+stud.getSal());
}
}
class AdmissionApp{
public static void main(String args[])
{
Admission ad=new Admission();
Student s=new Student();

s.setName("ab");
s.setId(1);
s.setSal(4500);

ad.addNewadmission(s);
ad.show();

}}