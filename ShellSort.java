package ru.kpfu.itis.java2.shellsort;

import ru.kpfu.itis.java2.shellsort.generate.Generate;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = Generate.generate(228);
        long time1 = System.nanoTime();
        sort(array);
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
    }

    public static void sort(int arrayToSort[]) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
}