package com.bridgelabz.snakeladder;
public class SnakeAndLadder {
    static int pos = 0;
    static int rollDice(){
        return (int) (Math.random()*10 % 6 + 1);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladders Game");
        System.out.println("Start position is: " + pos);
        int dice = rollDice();
        System.out.println(dice);

    }
}