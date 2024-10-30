import java.util.Random;

/* Выводит строку на консоль столько раз,
 сколько переменная передала в метод */

public class FourthTask {
    public static void main(String[] args) {
        Random random = new Random();

        int task4 = random.nextInt(3, 10);
        String stTask4 = "Хэппи! Хэппи! Хэппи!\n";

        MethodTask4(task4, stTask4);
    }

    public static String MethodTask4 (int task4, String stTask4) {
        System.out.println(stTask4.repeat(task4));
        return stTask4;
    }

}
