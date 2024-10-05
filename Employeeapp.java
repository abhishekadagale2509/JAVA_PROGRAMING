import java.util.*;

public class Employee {
    int bsal;
    String name;
    int id, pro;
    int insal; // Declare insal outside of the prog method

    void setdata(int i, String n, int s) {
        bsal = s;
        id = i;
        name = n;
    }

    void prog(int pro) {
        if (pro > 60) {
            insal = bsal * 30 / 100;
        }
    }

    void show() {
        int total = insal + bsal;
        System.out.printf("Basic Salary: %d\n", bsal);
        System.out.printf("Total Salary: %d\n", total);
        System.out.printf("Employee ID: %d\n", id);
        System.out.printf("Employee Name: %s\n", name);
    }
}

public class Employeeapp {
    public static void main(String args[]) {

        Employee e = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        int bsal = sc.nextInt();
        System.out.print("Enter Productivity: ");
        int pro = sc.nextInt();

        e.setdata(id, name, bsal);
        e.prog(pro);

        e.show();

        sc.close();
    }
}
