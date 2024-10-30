import java.util.Arrays;
import java.util.Random;

/* Метод MethodTask8 принимает массив чисел и возврощает самый большой элемент*/

public class EighthTask {
    public static void main(String[] args) {
        Random random = new Random();

        int[] task8 = new int[10];
        for (int i = 0; i < task8.length; i++) {
            task8[i] = random.nextInt(0, 10);
        }

        System.out.println(Arrays.toString(task8));
        System.out.println(MethodTask8(task8));
    }

    public static int MethodTask8(int[] task8) {

        int temp = 0;

        for (int i = 0; i < task8.length; i++) {
            if (task8[i] >= temp) {
                temp = task8[i];
            }
        }

        return temp;
    }
}
