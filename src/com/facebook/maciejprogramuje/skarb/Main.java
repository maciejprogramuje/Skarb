package com.facebook.maciejprogramuje.skarb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Integer.parseInt(scanner.nextLine()); i++) {
            for (int j = 0; j < Integer.parseInt(scanner.nextLine()); j++) {
                String[] inputLine = scanner.nextLine().split(" ");
                Integer direction = Integer.valueOf(inputLine[0]);
                Integer steps = Integer.valueOf(inputLine[1]);
            }
        }
    }
}
