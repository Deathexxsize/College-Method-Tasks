import java.util.Random;

/* метод MethodTask7 принимает числа и возврощает самый большой из них*/

public class SeventhTask {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(0, 10);
        int b = random.nextInt(0, 10);
        int c = random.nextInt(0, 10);

        System.out.println(MethodTask7(a, b, c));
    }

    public static int MethodTask7(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
}
