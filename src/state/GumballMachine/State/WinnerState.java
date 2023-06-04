package state.GumballMachine.State;

import state.GumballMachine.GumballMachine.GumballMachine;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void ejectQuarter(){
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void turnCrank(){
        System.out.println("Turning twice doesn't get you another Gumball!");
    }

    public void dispense(){
        System.out.println("YOU'RE A WINNER! You get two Gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of Gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public void refill() { }

    public String toString(){
        return "dispensing two Gumballs for your quarter, because YOU'RE A WINNER!";
    }

}
