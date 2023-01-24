package com.example.projekt;

import java.util.Random;

public class LiczbaLosowa {

    public static void main(String[] args) {
        Random rand = new Random();
        int liczba = rand.nextInt();
        System.out.println(liczba);
    }
}
