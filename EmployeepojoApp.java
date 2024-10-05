import java.util.*;
 class Employeepojo{
     private int id;
      private String name;
       private float sal;
     
     public void setId(int i){
         id=i;
         
     }
     
     public int getId(){
         return id;
         
     }
        public void setName(String n){
         name=n;
         
         
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
 class EmployeepojoApp{
     public static void main(String args[])
     {
         Employeepojo e=new Employeepojo();
         e.setId(1);
         e.setName("ab");
         e.setSal(45000f);
         
         System.out.printf("emp id is %d\n",e.getId());
          System.out.printf("emp id is %s\n",e.getName());
           System.out.printf("emp id is %.2f\n",e.getSal());
     }
 }