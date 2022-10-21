package ru.vsu.cs.vvp2022.guzenko_ya_a;

import java.util.Scanner;

public class Main {
    public static void printFigure(int s) {
        int num_stars = 1;
        while (num_stars < s + 1) {
            printDistrict(num_stars, s);
            num_stars += 2;
        }
        num_stars -= 2;
        while (num_stars > 0) {
            num_stars -= 2;
            printDistrict(num_stars, s);
        }
    }
    public static void printDistrict(int num_stars, int s) {
        for (int i = 0; i < (s - num_stars) / 2; i++){
            System.out.print(" ");
        }
        for (int i = 0; i < num_stars; i++){
            System.out.print("*");
        }
        for (int i = 0; i < (s - num_stars) / 2; i++){
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static int readS() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите s");

        int s = scanner.nextInt();

        return s;
    }
    public static void main(String[] args) {
        int s = readS();
        printFigure(s);
    }
}
