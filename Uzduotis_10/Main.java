package Uzduotis_10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    private static void noPVM(int kiekis, double sumaPVM){

        noPVM(kiekis, sumaPVM, 2);
    }

    private static void noPVM(int kiekis, double sumaPVM, int kainaNoPVM){

        BigDecimal prekesKaina = BigDecimal.valueOf(sumaPVM).divide(BigDecimal.valueOf(kiekis), RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(100.0 / 121.0));
        BigDecimal sumaBePVM = prekesKaina.multiply(BigDecimal.valueOf(kiekis));

        System.out.println(" Prekės kaina be PVM : " + prekesKaina.setScale(kainaNoPVM, RoundingMode.HALF_EVEN));
        System.out.println(" Kiekis              : " + kiekis);
        System.out.println(" Suma be PVM         : " + sumaBePVM.setScale(2,RoundingMode.HALF_EVEN));
        System.out.println(" PVM Suma            : " + BigDecimal.valueOf(sumaPVM).subtract(sumaBePVM).setScale(2,RoundingMode.HALF_EVEN));// = suma-sumaBePVM
        System.out.println(" Viso Suma su PVM    : " + BigDecimal.valueOf(sumaPVM).setScale(2,RoundingMode.HALF_EVEN));
    }

    public static void main(String [] args){

        noPVM(10,200);
        noPVM(9,11.59);
    }
}
