import java.util.Random;

// В methodTask3 передается число и она проверят отрицательное или положительное
// и возврощает в виде строки

public class ThirdTask {
    public static void main(String[] args) {
        Random random = new Random();

        int task3 = random.nextInt(-10, 10);

        System.out.println(methodTask3(task3));
    }

    public static String methodTask3(int task3) {
        if (task3 > 0) {
            return "Число положительное!";
        } else if (task3 < 0) {
            return "Число отрицательное";
        } else {
            return "Число равен нулю";
        }

    }

}
