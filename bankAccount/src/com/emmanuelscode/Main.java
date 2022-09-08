package com.emmanuelscode;

public class Main {
    public static void main(String[] args) {

        // Instantiating emmanuel's Account
        Account emmanuelAccount = new Account("12345", 0.00, "Emmanuel Adu",
                "eadu.1111@gmail.com", "808-372-0253");
        // Withdraw and Deposit
        emmanuelAccount.withdrawFunds(500.4);
        emmanuelAccount.depositFunds(250.4);
        emmanuelAccount.withdrawFunds(500.4);
        emmanuelAccount.depositFunds(50);
        System.out.println("\n");

        // instantiating Nadia's Account
        Account nadiaAccount = new Account("Nadia Adu", "nh@yahoo.com", "777-7777-77");
        System.out.println(nadiaAccount.getCustomerName());
        // instantiating default account
        Account defaultAccount = new Account();
        System.out.println(defaultAccount.getCustomerEmailAddress());
        System.out.println("\n");

        // VipCustomer - elon
        VipCustomer elon = new VipCustomer(850, "musk@tesla.com");
        System.out.println(elon.getEmailAddress());
        // VipCustomer - ted
        VipCustomer ted = new VipCustomer( "Ted Lasso",500, "lasso@ted.com");
        System.out.println(ted.getName());
        // VipCustomer - default
        VipCustomer vipDefaultAccount = new VipCustomer();
        System.out.println(vipDefaultAccount.getEmailAddress());





    }
}