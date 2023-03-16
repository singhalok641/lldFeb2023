package designPatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;

    public String getName() {
        return name;
    }

    private String name;

    public PhonePe(BankAPIAdapter bankAPI, String name) {
        this.bankAPI = bankAPI;
        this.name = name;
    }

    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 60 * 1000);
        return currentBalance * 2;
    }
}

// Break till 10:06 PM
// Intro to Decorator -> end by 10:30ish