package org.designpattern.structural.facade;

import org.designpattern.structural.facade.impl.LoanFacade;

public class Main {
    public static void main(String[] args) {
        LoanFacade loanFacade = new LoanFacade();
        loanFacade.applyForLoan("BORROWER123", 30000);
        loanFacade.applyForLoan("BORROWER456", 60000);
    }
}
