package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class mediatorTest {

    @Test
    public void test(){
        IMediator mediator = new ConcreteMediator();

        ColleagueA talkColleague = new ColleagueA(mediator);
        ColleagueB fightColleague = new ColleagueB(mediator);

        talkColleague.doSomething();
        fightColleague.doSomething();
    }

}