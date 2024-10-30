import java.util.Arrays;
import java.util.Random;

/* Описание 2 задачи:
Если длина двух массивов одинаковая, вывести сумму каждого массива,
сли нет, вывести на кансоль "Длина массивов не одинаковая!"*/

public class SecondTask {
    public static void main(String[] args) {
        Random random = new Random();

        int[] task2 = new int[5];
        int[] task2_1 = new int[5];

        for (int i = 0; i < task2.length; i++) {
            task2[i] = random.nextInt(0, 10);
            for (int j = 0; j < task2_1.length; j++) {
                task2_1[j] = random.nextInt(0, 10);
            }
        }

        System.out.println("\n 2 задача \n");

        System.out.println("Первый массив: " + Arrays.toString(task2));
        System.out.println("Второй массив: " + Arrays.toString(task2_1));

        task2(task2, task2_1);  // вызывается метод и передается туда массивы

    }

    public static void task2(int[] task2, int[] task2_1) {

        if (task2.length == task2_1.length) { // Проверяет равны ли длина массива
            int task1Temp = 0;
            int task1_1Temp = 0;
            for (int i = 0; i < task2.length; i++) {
                task1Temp += task2[i];
            }
            for (int j = 0; j < task2_1.length; j++) {
                task1_1Temp += task2_1[j];
            }

            System.out.println("Сумма первого массива: " + task1Temp);
            System.out.println("Сумма второго массива: " + task1_1Temp);
        } else {
            System.out.println("Длина массивов не одинаковая!");
        }

    }
}
