package Uzduotis_9;

public class Main {

    public static void main(String [] args){

        Payment [] payments = new Payment[5];

        payments[0] = new Client("UAB DID", 74121, 7451);
        payments[1] = new Client("UAB PNM", 159884131, 5235);
        payments[2] = new Employee("Dave", 1936115470, 123);
        payments[3] = new Client("UAB POP", 841846889, 211);
        payments[4] = new Employee("Peter", 911226014, 80);

        for(Payment payment : payments){

            System.out.println(payment.getType() + " " + payment.getAccountOwner() + " " + payment.getBankAccount() + " " + payment.getAmount());
        }
    }
}
