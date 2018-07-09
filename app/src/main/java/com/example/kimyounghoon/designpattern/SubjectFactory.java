package com.example.kimyounghoon.designpattern;

import java.util.HashMap;
import java.util.Map;

public class SubjectFactory {

    Map<String, Subject> subjects = new HashMap<>();

    public synchronized Subject getSubject(String name){
        Subject subject = subjects.get(name);
        if(subject==null){
            subject = new Subject(name);
            subjects.put(name,subject);
        }
        return subject;
    }

}