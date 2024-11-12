package org.designpattern.structural.composite;

import org.designpattern.structural.composite.impl.BusinessLoan;
import org.designpattern.structural.composite.impl.LoanComponent;
import org.designpattern.structural.composite.impl.LoanPackage;
import org.designpattern.structural.composite.impl.PersonalLoan;

public class Main {
    public static void main(String[] args) {
        LoanComponent pl = new PersonalLoan(1000.0, 10.0, 2);
        LoanComponent bl = new BusinessLoan(5000.0, 8.0, 5);

        LoanPackage loanPackage = new LoanPackage();
        loanPackage.addLoan(pl);
        loanPackage.addLoan(bl);

        loanPackage.showDetails();
    }
}
