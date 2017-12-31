package Uzduotis_9;

public class Employee implements Payment {

    private String name;
    private int accountNumber;
    private double ammount;
    private String type;

    Employee(String name, int accountNumber, double amount){
        this.name = name;
        this.accountNumber = accountNumber;
        this.ammount = amount;
        this.type = "Emplayee";
    }


    @Override
    public int getBankAccount() {
        return accountNumber;
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
