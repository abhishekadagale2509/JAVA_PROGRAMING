public class Employee {
    
    private int id;
    private String name;
    private long sal;
    
    public void setval(int i, String n, long s) {
        id = i;
        name = n;
        sal = s;
    }
    
    public void show(String type) {
        if (type.equals("manager")) {
            System.out.printf("ID: %d, Name: %s, Salary: %d%n", id, name, sal);
        } else if (type.equals("security")) {
            System.out.printf("ID: %d, Name: %s, Salary: %d%n", id, name, sal);
        } else {
            System.out.println("Data not accessible");
        }
    }
    
    public static void main(String args[]) {
        Employee emp = new Employee();
        emp.setval(1, "ab", 45000);
        emp.show("manager");
    }
}