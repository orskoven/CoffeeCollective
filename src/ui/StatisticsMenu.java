package ui;

import statistics.CoffeeTypeCounter;

import java.util.Scanner;

public class StatisticsMenu {
    private Scanner sc = new Scanner(System.in);

    public StatisticsMenu(Scanner sc) {
        this.sc = sc;
    }

    public StatisticsMenu() {

    }

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void printStatisticsChoice(){
        System.out.println("1. Coffee statistics");
        System.out.println("2. Food statistics");
    }

    public void displayCoffeeStatistics(){
        System.out.println(new CoffeeTypeCounter().howManyCoffeesSold());
    }

    public void displayFoodStatistics(){
        System.out.println(new CoffeeTypeCounter().howManyFoodsSold());
    }
}
