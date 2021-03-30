package com.itvillage.book.cracking.problem07.problem0702;

import java.util.List;

public class CallHandler {
    private CustomerHelper customerHelper;
    private Manager manager;
    private Supervisor supervisor;

    public void receiveCall() {

    }

    public void dispatchCall() {
        List<CustomerHelper> customerHelpers = findNoBusyCustomHelper();
        List<Manager> managers = findNoBusyManager();
        if (customerHelpers.size() == 0 && managers.size() > 0) {
            manager.handleCall();
        } else if (customerHelpers.size() == 0 && managers.size() == 0) {
            supervisor.handleCall();
        } else {
            customerHelpers.get(0).handleCall();
        }
    }

    private List<Manager> findNoBusyManager() {
        return null;
    }

    private List<CustomerHelper> findNoBusyCustomHelper() {
        return null;
    }
}
