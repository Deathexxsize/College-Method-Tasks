import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        String[] students = {"Сули", "Нуржигит", "Курманбек", "Шаха"};

        if (MethodTask10(students)) {
            System.out.println("Человек найден!");
        } else {
            System.out.println("Человек не найден!");
        }
    }

    public static boolean MethodTask10(String[] students) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String search = scanner.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(search)) {
                return true;
            }
        }
        return false;
    }
}
