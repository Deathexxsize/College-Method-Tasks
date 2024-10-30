import java.util.Arrays;
import java.util.Random;

public class NinthTask {
    public static void main(String[] args) {
        Random random = new Random();

        int[] task9 = new int[10];
        for (int i = 0; i < task9.length; i++) {
            task9[i] = random.nextInt(0, 10);
        }

        System.out.println(Arrays.toString(task9));
        System.out.println(MethodTask8(task9));
    }

    public static int MethodTask8(int[] task9) {
        int temp = task9[0];
        for (int i = 1; i < task9.length; i++) {
            if (task9[i] < temp) {
                temp = task9[i];
            }
        }

        return temp;
    }
}
