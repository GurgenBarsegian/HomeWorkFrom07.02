import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for ( int var = 0; var < 100 ;) {

            int var1 = random.nextInt(10);
            int var2 = random.nextInt(10);
            int result = var1 + var2;
            System.out.println(var1 + "+" + var2);
            System.out.println("Ваш ответ: ");
            int answerInt = scanner.nextInt();
            boolean isRight = answerInt == result;
            boolean isEnter = scanner.next().equals("exit");

            if (isRight) {
                System.out.println("Правильный ответ " + result +
                            ". Текущее количество баллов: " + (var = var + 5));
            }
            else {
            System.out.println("Правильный ответ " + result +
                            ". Текущее количество баллов: " + (var = var - 5));
            }
//            if (scanner.next().equals("exit")) {
//                System.out.println("Ура! Опросник завершён! Ваш финальный счёт: " + var);
//                return;
//            }
        }
    }
}


