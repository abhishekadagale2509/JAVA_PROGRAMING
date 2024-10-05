import java.util.*;

class Sum {
    int sum = 0;

    void calculateSum(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.printf("Sum: %d\n", sum);
    }
}

public class Methodvar {
    public static void main(String args[]) {
        Sum sumObject = new Sum();
        sumObject.calculateSum(23, 4, 5, 6, 7, 8, 9, 9);
    }
}
