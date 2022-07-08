import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);

        String firstStr = in.next();

        String expandStr = expandString(firstStr);
        System.out.println("Перевернутая строка: " + expandStr);

        long currentTime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            expandString(firstStr);
        }
        System.out.println("Время работы 1000 повторений: " + (System.currentTimeMillis() - currentTime1));

        long currentTime2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            expandString(firstStr);
        }
        System.out.println("Время работы 10 000 повторений: " + (System.currentTimeMillis() - currentTime2));

        long currentTime3 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            expandString(firstStr);
        }
        System.out.println("Время работы 100 000 повторений: " + (System.currentTimeMillis() - currentTime3));

    }

    static String expandString(String str) {
        StringBuilder expStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            expStr.append(str.charAt(i));
        }
        return expStr.toString();
    }
}
