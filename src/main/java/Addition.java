import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Addition {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 26;
        System.out.println("sum from main method " + num1 + num2);
        System.out.println("sum from Integer method " + sum(num1, num2));
        List list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List list2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("sum from Integer method " + sum(list1, list2));
    }

    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    double divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    static String sum(String s1, String s2) {
        return s1 + s2;
    }

    float sum(float num1, float num2) {
        return num1 + num2;
    }

    double sum(double num1, double num2) {
        return num1 + num2;
    }


    static List sum(List list1, List list2) {
        List listSum = new ArrayList();
        listSum.addAll(list1);
        listSum.addAll(list2);
        return listSum;
    }
}


