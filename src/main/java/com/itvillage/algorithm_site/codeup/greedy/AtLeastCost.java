package com.itvillage.algorithm_site.codeup.greedy;

import java.util.Scanner;

public class AtLeastCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceP1 = scanner.nextInt();
        scanner.nextLine();
        int priceP2 = scanner.nextInt();
        scanner.nextLine();
        int priceP3 = scanner.nextInt();
        scanner.nextLine();
        int priceF1 = scanner.nextInt();
        scanner.nextLine();
        int priceF2 = scanner.nextInt();
        scanner.nextLine();

        int[] pastas = new int[]{priceP1, priceP2, priceP3};
        int[] fruits = new int[]{priceF1, priceF2};
        int minPastaPrice = Integer.MAX_VALUE;
        int minFruitPrice = Integer.MAX_VALUE;

        for (int pastaPrice : pastas) {
            minPastaPrice = Math.min(pastaPrice, minPastaPrice);
        }

        for (int fruitPrice : fruits) {
            minFruitPrice = Math.min(fruitPrice, minFruitPrice);
        }

        System.out.println(minPastaPrice + minFruitPrice + (minPastaPrice + minFruitPrice) * 0.1);
    }
}
