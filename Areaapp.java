import java.util.Scanner;

class Areaofrect {

    private int len,wid,area;

    void setlenwid(int l,int w) {
        len=l;

wid=w;

    }

    int calculateArea() {
        return area= len*wid;
 System.out.printf("Area of the circle: %\n", area);


    }
}

public class Areaapp {

    public static void main(String args[]) {
        Areaofrect rc= new Areaofrect();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the len and wid: ");
        int len = sc.nexInt();

int wid = sc.nexInt();

        // Set the radius using the setRadius method
      rc.setlenwid(len,wid);

        // Calculate and display the area using the calculateArea method
        rc.calculateArea();
        //System.out.printf("Area of the circle: %.2f\n", area);

        sc.close();
    }
}
