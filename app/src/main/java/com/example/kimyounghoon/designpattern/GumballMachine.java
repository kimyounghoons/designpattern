package com.example.kimyounghoon.designpattern;

import com.example.kimyounghoon.designpattern.interfaces.HasQuarterState;
import com.example.kimyounghoon.designpattern.interfaces.NoQuarterState;
import com.example.kimyounghoon.designpattern.interfaces.SoldOutState;
import com.example.kimyounghoon.designpattern.interfaces.SoldState;
import com.example.kimyounghoon.designpattern.interfaces.State;
import com.example.kimyounghoon.designpattern.interfaces.WinnerState;

public class GumballMachine {

    private State winnerState;
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int count = 0;


    public GumballMachine(int numberGameballs) {
        this.count = numberGameballs;
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldState() {
        return soldState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public int getCount() {
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
