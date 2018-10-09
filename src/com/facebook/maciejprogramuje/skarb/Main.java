package com.facebook.maciejprogramuje.skarb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Result result = new Result();

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCases; i++) {
            Position position = new Position();
            int moves = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < moves; j++) {
                String[] inputLine = scanner.nextLine().split(" ");
                Integer direction = Integer.valueOf(inputLine[0]);
                Integer steps = Integer.valueOf(inputLine[1]);

                switch (direction) {
                    case 0:
                        position.setY(position.getY() + steps);
                        break;
                    case 1:
                        position.setY(position.getY() - steps);
                        break;
                    case 2:
                        position.setX(position.getX() - steps);
                        break;
                    case 3:
                        position.setX(position.getX() + steps);
                        break;
                }
            }


            int y = position.getY();
            int x = position.getX();
            if (y == 0 && x == 0) {
                result.addLine("studnia");
            } else {
                if (y > 0) {
                    result.addLine("0 ", y);
                } else if (y < 0) {
                    result.addLine("1 ", y);
                }
                if (x > 0) {
                    result.addLine("3 ", x);
                } else if (x < 0) {
                    result.addLine("2 ", x);
                }
            }
        }

        System.out.println(result.print());
    }
}

class Position {
    private int x;
    private int y;

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }
}

class Result {
    private StringBuilder result;

    Result() {
        result = new StringBuilder();
    }

    void addLine(String s) {
        result.append(s).append("\n");
    }

    void addLine(String s, int i) {
        result.append(s).append(Math.abs(i)).append("\n");
    }

    String print() {
        return result.toString();
    }
}
