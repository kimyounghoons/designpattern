package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class flyweightTest {

    @Test
    public void test() {
        SubjectFactory subjectFactory = new SubjectFactory();
        Subject subject = subjectFactory.getSubject("a");
        Subject subject1 = subjectFactory.getSubject("a");
        Subject subject2 = subjectFactory.getSubject("b");
        Subject subject3 = subjectFactory.getSubject("b");

        System.out.println(subject == subject1);
        System.out.println(subject1 == subject2);
        System.out.println(subject2 == subject3);
    }
}
