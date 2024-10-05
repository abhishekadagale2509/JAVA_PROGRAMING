import java.util.Scanner;

class AreaOfRect {
    private int len, wid, area;

    void setLenWid(int l, int w) {
        len = l;
        wid = w;
    }

    int calculateArea() {
        area = len * wid;
        System.out.printf("Area of the rectangle: %d\n", area);
        return area;
    }
}

public class Areaapprect {
    public static void main(String args[]) {
        AreaOfRect rc = new AreaOfRect();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and width: ");
        int len = sc.nextInt();
        int wid = sc.nextInt();

        // Set the length and width using the setLenWid method
        rc.setLenWid(len, wid);

        // Calculate and display the area using the calculateArea method
        rc.calculateArea();

        sc.close();
    }
}
