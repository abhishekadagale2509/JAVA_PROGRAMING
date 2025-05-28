import java.util.*;
class ABC{
static int no=10;
static void show(){
    System.out.printf("%d",no);
}
}
public class StatFun{
    public static void main(String args[]){
        ABC.show();
    }
}
/*import java.util.*; // Unused import in this case

class ABC {
    static int no = 10; // Static variable shared across all instances
    static void show() {
        System.out.printf("%d", no); // Prints the value of 'no'
    }
}

public class StatFun {
    public static void main(String args[]) {
        ABC.show(); // Calls the static method without creating an object
    }
}
 */