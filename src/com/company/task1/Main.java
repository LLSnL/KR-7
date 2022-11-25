package com.company.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число месяца");
        int choice = sc.nextInt();
        System.out.print("Это - ");
        switch (choice) {
            case 1 -> System.out.println(Months.JANUARY.getName());
            case 2 -> System.out.println(Months.FEBRUARY.getName());
            case 3 -> System.out.println(Months.MARCH.getName());
            case 4 -> System.out.println(Months.APRIL.getName());
            case 5 -> System.out.println(Months.MAY.getName());
            case 6 -> System.out.println(Months.JUNE.getName());
            case 7 -> System.out.println(Months.JULY.getName());
            case 8 -> System.out.println(Months.AUGUST.getName());
            case 9 -> System.out.println(Months.SEPTEMBER.getName());
            case 10 -> System.out.println(Months.OCTOBER.getName());
            case 11 -> System.out.println(Months.NOVEMBER.getName());
            case 12 -> System.out.println(Months.DECEMBER.getName());
            default -> System.out.println("Неверный ввод!");
        }
    }
}