package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousByte = -1;
        int currentByte;

        while ((currentByte = System.in.read()) != -1) {
            if (previousByte == 13) {
                if (currentByte == 10) {
                    System.out.write(10);
                    previousByte = -1;
                } else if (currentByte == 13) {
                    System.out.write(13);
                } else {
                    System.out.write(13);
                    System.out.write(currentByte);
                    previousByte = -1;
                }
            } else {
                if (currentByte == 13) {
                    previousByte = 13;
                } else {
                    System.out.write(currentByte);
                }
            }
        }

        if (previousByte == 13) {
            System.out.write(13);
        }

        System.out.flush();
    }
}
