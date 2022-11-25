package com.company.task2;

import java.util.ArrayList;
import java.util.Collections;

public enum Car {
    BMW("БМВ",Colour.PINK, Mark.X6, 270, 3_000_000),
    FORD("Форд", Colour.WHITE, Mark.FOCUS, 290, 2_750_000),
    LADA("Лада", Colour.BLACK,Mark.NIVA, 170, 700_000),
    KIA("Киа",Colour.YELLOW,Mark.PICANTO, 200, 1_700_000),
    NISSAN("Ниссан",Colour.GREEN,Mark.ROGUE, 230, 1_500_000);

    private final String name;
    private final Enum<Colour> colour;
    private final Enum<Mark> mark;
    private final int maxSpeed;
    private final long price;

    Car(String name, Enum<Colour> colour, Enum<Mark> mark, int maxSpeed, long price) {
        this.name = name;
        this.colour = colour;
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Enum<Colour> getColour() {
        return colour;
    }

    public Enum<Mark> getMark() {
        return mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public long getPrice() {
        return price;
    }

    public static ArrayList<Car> asList(){
        ArrayList<Car> list = new ArrayList<>(5);
        Collections.addAll(list, values());
        return list;
    }

    @Override
    public String toString() {
        return "1) название модели: " + this.getName() +
                "; 2) марка: " + this.getMark() +
                "; 3) цвет: " + this.getColour() +
                "; 4) цена: " + this.getPrice() +
                "; 5) максимальная скорость: " + this.getMaxSpeed();
    }
}
