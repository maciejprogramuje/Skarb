package com.facebook.maciejprogramuje.skarb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            Integer x = 0;
            Integer y = 0;
            int moves = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < moves; j++) {
                String[] inputLine = scanner.nextLine().split(" ");
                Integer direction = Integer.valueOf(inputLine[0]);
                Integer steps = Integer.valueOf(inputLine[1]);

                switch (direction) {
                    case 0:
                        y += steps;
                        break;
                    case 1:
                        y -= steps;
                        break;
                    case 2:
                        x -= steps;
                        break;
                    case 3:
                        x += steps;
                        break;
                }
                System.out.println("x=" + x + ", y=" + y);
            }
            System.out.println("end x=" + x + ", y=" + y);
        }
    }
}
