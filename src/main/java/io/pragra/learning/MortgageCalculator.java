package io.pragra.learning;

import java.util.function.Consumer;

public class MortgageCalculator {
    public void mortgageRenewals(Integer year,
                                 Double rateOfInterest,
                                 ICalculateUtility calculateUtility){
        Double result = calculateUtility.calculate(year, rateOfInterest);
        System.out.println("Renewal quote: " + result);
    }

}
