package com.bridgelabz.snakeladder;

public class SnakeAndLadder {
    public static final int NOPLAY=0;
    public static final int LADDER=1;
    public static final int SNAKE=2;
    static int pos = 0;
    static int rollCount;
    static int rollDice(){
        rollCount++;
        return (int)(Math.random()*10 % 6 + 1);
    }
    static int getOption() {
        return (int)(Math.random() * 10 % 3);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladders Game");
        System.out.println("Start position is: " + pos);
        while(pos!=100){
            int dice = rollDice();
            int option = getOption();
            switch (option) {
                case NOPLAY:
                    System.out.println("Player position: " + pos);
                    break;
                case LADDER:
                    if (pos+dice<=100)
                        pos += dice;
                    System.out.println("Player position: " + pos);
                    break;
                case SNAKE:
                    pos -= dice;
                    if (pos<0)
                        pos = 0;
                    System.out.println("Player position: " + pos);
                    break;
            }
        }
        System.out.println("Player position: " + pos);
        System.out.println("Dice is rolled " + rollCount + " times.");
        System.out.println("Player Wins");

    }
}