package com.company.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = Car.asList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введете имеющуюся сумму денег");
        long sum = sc.nextLong();
        for (int i = 0; i < carArrayList.size(); i++) {
            if(carArrayList.get(i).getPrice() > sum) {
                carArrayList.remove(i);
                --i;
            }
        }
        for (int i = 0; i < carArrayList.size(); i++) {
            for (int j = i; j < carArrayList.size(); j++) {
                if(carArrayList.get(j).getMaxSpeed() > carArrayList.get(i).getMaxSpeed())
                    Collections.swap(carArrayList,i,j);
            }
        }
        System.out.println("Доступные автомобиле, отсортированные по максимальной скорости:");
        for (Car car : carArrayList) {
            System.out.println(car.toString());
        }
    }
}