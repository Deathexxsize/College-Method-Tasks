/* MethodTask5 принимает стороку, переворачивает ее и возврощает  */

public class FifthTask {
    public static void main(String[] args) {
        String task5 = "ноднаг илуС";

        System.out.println(MethodTask5(task5));
    }

    public static String MethodTask5(String task5) {
        return new StringBuilder(task5).reverse().toString();
    }
}
