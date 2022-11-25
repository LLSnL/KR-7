package com.company.task2;

public enum Mark {
    X6("X6"),
    FOCUS("Фокус"),
    NIVA("Нива"),
    PICANTO("Пиканто"),
    ROGUE("Рога");

    private final String name;

    Mark(String name) {
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
