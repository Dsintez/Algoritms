package lesson2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SpeedTestSort {

    public static void main(String[] args) {
        Random random = new Random();
        Array<Integer> data1 = new ArrayImpl<Integer>();
        Array<Integer> data2 = new ArrayImpl<Integer>();
        Array<Integer> data3 = new ArrayImpl<Integer>();
        long time;
        for (int i = 0; i < 100_000; i++) {
            data1.add(random.nextInt(200_000));
        }
        for (int i = 0; i < 100_000; i++) {
            data2.add(data1.get(i));
        }
        for (int i = 0; i < 100_000; i++) {
            data3.add(data1.get(i));
        }

        System.out.println("Исходный массив1");
        print(data1);
        time = System.currentTimeMillis();
        data1.sortBubble();
        time = System.currentTimeMillis() - time;
        System.out.println("Сортировка пузырьком - " + TimeUnit.MILLISECONDS.toSeconds(time) + " сек.");
        print(data1);
        System.out.println();

        System.out.println("Исходный массив2");
        print(data2);
        time = System.currentTimeMillis();
        data2.sortSelect();
        time = System.currentTimeMillis() - time;
        System.out.println("Сортировка выбором - " + TimeUnit.MILLISECONDS.toSeconds(time) + " сек.");
        print(data2);
        System.out.println();

        System.out.println("Исходный массив3");
        print(data3);
        time = System.currentTimeMillis();
        data3.sortInsert();
        time = System.currentTimeMillis() - time;
        System.out.println("Сортировка вставкой - " + TimeUnit.MILLISECONDS.toSeconds(time) + " сек.");
        print(data3);
        System.out.println();
    }

    private static void print(Array<Integer> data) {
        System.out.printf(" %d, %d, %d, %d, %d, %d, %d, %d, %d, %d%n ", data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(99_995), data.get(99_996), data.get(99_997), data.get(99_998), data.get(99_999));
    }
}
