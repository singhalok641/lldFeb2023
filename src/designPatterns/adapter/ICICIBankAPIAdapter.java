package designPatterns.adapter;

import designPatterns.adapter.thirdparty.icicibank.IciciBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter {
    private IciciBankAPI iciciBankAPI = new IciciBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return iciciBankAPI.checkBalance(accountNumber);
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
//        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
