abstract class empl {
    abstract void setskill();
}

class Developer extends empl {
    void setskill() {
        System.out.printf("need coding knowledge");
    }
}

class tester extends empl {
    void setskill() {
        System.out.printf("require testing knowledge");
    }
}

public class abstractApp {
    public static void main(String args[]) {
        Developer dev = new Developer();
        dev.setskill();  // Output: need coding knowledge

        tester test = new tester();
        test.setskill();  // Output: require testing knowledge
    }
}

