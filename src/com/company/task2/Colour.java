package com.company.task2;

public enum Colour {
    BLACK("Чёрный"),
    WHITE("Белый"),
    PINK("Розовый"),
    YELLOW("Жёлтый"),
    GREEN("Зелёный");

    private final String name;

    Colour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
