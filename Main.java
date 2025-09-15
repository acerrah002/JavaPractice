package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    bot computeroutput = new bot();
    int PlayerOption=AskUserForPlayerOption();
    int BotOption=computeroutput.randomnum();
    System.out.println("Player Picked: " + PlayerOption);
    System.out.println("Bot Picked: " + BotOption);
    System.out.print("Game results are: ");
    System.out.print(gameresults(PlayerOption,BotOption));
    }
    public static int AskUserForPlayerOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number from 1 to 3(1 being Rock, 2 Being Scissors, 3 Being Paper): ");
        int PickedResult = scanner.nextInt();
        return PickedResult;
    }
    public static String gameresults(int x, int y) {
        if (x == 1 && y == 2) {
            return ("Player Wins!");
        } else if (x == 2 && y == 3) {
            return ("Player Wins!");
        } else if (x == 3 && y == 1) {
            return ("Player Wins!");
        } else if (x == 1 && y == 3) {
            return ("Bot Wins!");
        } else if (x == 3 && y == 2) {
            return ("Bot Wins!");
        } else if (x == 2 && y == 1) {
            return ("Bot Wins!");
        } else if (x == y) {
            return ("tie");
        }
        return "";
    }
    }
