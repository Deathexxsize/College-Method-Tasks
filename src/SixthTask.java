import java.util.Arrays;
import java.util.Random;

/* метод MethodTask6 принимает массив чисел и возврощает ее,
но каждый элемент больше на единицу */

public class SixthTask {
    public static void main(String[] args) {
        Random random = new Random();

        int[] task6 = new int[10];
        for (int i = 0; i < task6.length; i++) {
            task6[i] = random.nextInt(0, 10);
        }

        System.out.println("Изночальный массив: " + Arrays.toString(task6));
        System.out.println("Массив с элементами на 1 больше: " + Arrays.toString(MethodTask6(task6)));
    }

    public static int[] MethodTask6(int[] task6) {
        for (int i = 0; i < task6.length; i++) {
            task6[i]++;
        }

        return task6;
    }

}
