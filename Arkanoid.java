package com.javarush.task.task24.task2413;

import java.util.ArrayList;
import java.util.List;

public class Arkanoid {

    private static Arkanoid game;

    private boolean isGameOver;

    private Ball ball;
    private Stand stand;
    private List <Brick> bricks;

    private int width,height;

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public Stand getStand() {
        return stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run()
    {

    }

    public void move()
    {
        ball.move();
        stand.move();
    }

    public void draw(Canvas canvas)
    {

        for (Brick brick : bricks) {
            brick.draw(canvas);
        }
        ball.draw(canvas);
        stand.draw(canvas);
    }

    public void checkBricksBump()
    {
        for (Brick currentBrick : bricks) {
            if (currentBrick.isIntersec(ball)) {
                double angel = Math.random() * 360;
                ball.setDirection(angel);
                bricks.remove(currentBrick);
                break;
            }
        }
    }

    public void checkStandBump()
    {
        if (ball.isIntersec(stand)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame()
    {
        if (ball.getY() > getHeight()) isGameOver = true;
    }

    public static void main(String[] args) {

    }
}
