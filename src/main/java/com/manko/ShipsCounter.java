package com.manko;

/**
 * Created by Yevheniia Manko on 05.01.2021.
 */
public class ShipsCounter {
    static int[][] ships = {
            { 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, },
            { 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, },
            { 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, },
            { 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, },
            { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
            { 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, },
            { 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, }
    };

    public static void main(String[] args) {
        int count = 0;
        int n = ships.length;
        if (ships[0][0] == 1) {
            count++;
            System.out.println("i = 0, j = 0");
        }
        for (int k = 1; k < n; k++) {
            if (ships[0][k] == 1 && ships[0][k-1] == 0) {
                count++;
                System.out.println("i = 0, j = " + k);
            }
        }
        for (int k = 1; k < n; k++) {
            if (ships[k][0] == 1 && ships[k-1][0] == 0) {
                count++;
                System.out.println("i = " + k + ", j = 0");
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (ships[i][j] == 1 && ships[i][j-1] == 0 && ships[i-1][j] == 0) {
                    count++;
                    System.out.println("i = " + i + ", j = " + j);
                }
            }
        }
        System.out.println("n = " + n);

        // count ships here

        System.out.println("count = " + count);
    }
}