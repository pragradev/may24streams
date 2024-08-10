package io.pragra.learning;

public class RBCMortgageRenewals {
    public static Double RBCRenewals(Integer yr, Double ir){
        return yr*ir*8*2;
    }

    public void saveToDb(Integer value){
        System.out.println(value*232);
        System.out.println(value*232);
        System.out.println(value*232);
        System.out.println(value*232);
    }
    // (yr, ir) -> yr*ir*8;
}
