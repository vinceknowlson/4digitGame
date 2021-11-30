package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] digCode = {randNum(), randNum(), randNum(), randNum()};
        int[] guessNumbs = {getDigs(), getDigs(), getDigs(), getDigs()};
        System.out.println("Your total guess was" + Arrays.toString(guessNumbs));
        int count = 0;
        int points = 0;
        while (count < 4) {
            if (guessNumbs[count] == digCode[count]) {
                points = points + 1;

            }
            count = count + 1;

        }
        System.out.println("The answer was: " + Arrays.toString(digCode));
        System.out.println("You got " + points + " digits correct");

    }

    public static int getDigs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your next digit guess?");
        return scanner.nextInt();
    }

    public static int randNum() {
        Random random = new Random();
        int digCode = random.nextInt(10);
        return digCode;

    }
}

