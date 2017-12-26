package Uzduotis_9;

public class Client implements Payment {

    private String name;
    private int bankAccount;
    private double ammount;
    private String type;

    public Client(String name, int bankAccount, int ammount) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.ammount = ammount;
        this.type = "Client";
    }



    @Override
    public int getBankAccount() {
        return bankAccount;
    }

    @Override
    public String getAccountOwner() {
        return name;
    }

    @Override
    public double getAmount() {
        return ammount;
    }

    @Override
    public String getType() {
        return type;
    }
}
