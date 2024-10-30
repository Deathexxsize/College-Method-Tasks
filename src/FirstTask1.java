import java.util.Arrays;
import java.util.Random;

/* Описание 1 задачи:
Метод А передает массив в Метод Б и она выводит длину массива"*/

public class FirstTask {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("\n 1 задача \n");

        int[] task1 = new int[10];
        for (int i = 0; i < task1.length; i++) {
            task1[i] = random.nextInt(0, 10);
        }

        task1(task1); // вызывается метод и передается туда массив
    }

    public static int[] task1 (int[] task1) {
        System.out.println(Arrays.toString(task1)); // Принимает массив и выводит ее длину
        return task1;
    }

}
