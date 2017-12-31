package Uzduotis_12;

public class Employee {
    private String name;
    private Adress adress;

    Employee(String name, String city, String adress) {
        this.name = name;
        this.adress = new Employee.Adress();
        this.adress.city = city;
        this.adress.adress = adress;
    }

    private static class Adress{

        String city;
        String adress;


    }

    public String getCity() {
        return this.adress.city;
    }
}
