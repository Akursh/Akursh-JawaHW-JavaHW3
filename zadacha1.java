/* Задание

Пусть дан произвольный список из 100 целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class zadacha1 {
    public static void main(String[] args) throws Exception {
            try (Scanner iScanner = new Scanner(System.in)) {
            int N = 100;
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ar.add(x);
            }
            System.out.println("Произвольный список 100 целых чисел: \n " + ar);

            for (int i = ar.size() - 1; i >= 0; i--) {
                int even = ar.get(i) % 2;
                if (even == 0) {
                    ar.remove(i);
                }
            }
            Collections.sort(ar);
            System.out.println("Список с нечетными числами: \n " + ar);
        int max = max(ar);
        int min = min(ar);
        int maxItem = ar.get(0);
        int minItem = ar.get(0);
        int sumItems = 0;
        for (int item : ar) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/ar.size();
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Среднее значение %s\n", average);
        }
    }
}