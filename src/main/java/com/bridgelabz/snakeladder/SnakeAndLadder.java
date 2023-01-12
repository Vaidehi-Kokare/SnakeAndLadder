package com.bridgelabz.snakeladder;
public class SnakeAndLadder {
    public static final int NOPLAY=0;
    public static final int LADDER=1;
    public static final int SNAKE=2;
    static int pos = 0;
    static int rollDice(){
        return (int)(Math.random()*10 % 6 + 1);

    }
    static int getOption() {
        return (int)(Math.random() * 10 % 3);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladders Game");
        System.out.println("Start position is: " + pos);
        int dice = rollDice();
        System.out.println(dice);
        int option = getOption();
        switch (option) {
            case NOPLAY:
                break;
            case LADDER:
                pos += dice;
                break;
            case SNAKE:
                pos -= dice;
                break;
        }
        System.out.println("Player position is: " + pos);
    }
}