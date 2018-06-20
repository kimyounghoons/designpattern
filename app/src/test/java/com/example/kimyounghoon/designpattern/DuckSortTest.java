package com.example.kimyounghoon.designpattern;

import org.junit.Test;

import java.util.Arrays;

public class DuckSortTest {

    @Test
    public void test() {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2)
        };

        System.out.println("정렬 전");
        display(ducks);

        System.out.println("정렬 후");
        Arrays.sort(ducks);
        display(ducks);
    }

    private void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
