package com.javarush.task.task24.task2413;

import com.javarush.task.task24.task2413.BaseObject;
import com.javarush.task.task24.task2413.Canvas;

public class Stand extends BaseObject {

    private double speed;
    private double direction;

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    public void move() {
        x += direction * speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public void moveLeft() {
        direction = -1;
    }

    public void moveRight() {
        direction = 1;
    }
}