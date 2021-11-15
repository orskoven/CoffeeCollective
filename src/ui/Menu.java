package ui;

import java.util.Scanner;

public abstract class Menu {
    private Scanner sc = new Scanner(System.in);

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public int receiveUserInput(){
        int userInput = sc.nextInt();
        return userInput;
    }

    public void welcomeUser(){
        System.out.println("Hello and welcome");
        System.out.println("What would you like to order?");
    }
}
