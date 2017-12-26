package Uzduotis_11;

public class Zmogus {
    private String name;
    private String surname;
    private String idNo;

    public Zmogus(String name, String surname, String idNo) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
    }

    public String FullName(){
        return this.name + " " + this.surname;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
