package ru.kpfu.itis.java2.shellsort.generate;

import java.util.Random;

public class Generate {
    public static int[] generate(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
}
