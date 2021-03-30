package com.itvillage.book.cracking.problem07.problem0702;

public class Manager {
    private String dept;
    private String name;
    private boolean canHandle;
    private Supervisor supervisor;

    public Manager(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public void handleCall() {

    }
}
