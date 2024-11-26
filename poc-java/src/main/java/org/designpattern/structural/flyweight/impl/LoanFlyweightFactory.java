package org.designpattern.structural.flyweight.impl;

import java.util.HashMap;
import java.util.Map;

public class LoanFlyweightFactory {
    private static final Map<String, LoanFlyweight> loanFlyweights = new HashMap<>();

    public static LoanFlyweight getLoanFlyweight(String loanType, double interestRate, int term) {
        String key = loanType + "-" + interestRate + "-" + term;
        if (!loanFlyweights.containsKey(key)) {
            loanFlyweights.put(key, new ConcreteLoanFlyweight(loanType, interestRate, term));
            System.out.println("Created new flyweight for: " + key);
        } else {
            System.out.println("Reusing existing flyweight for: " + key);
        }
        return loanFlyweights.get(key);
    }
}
