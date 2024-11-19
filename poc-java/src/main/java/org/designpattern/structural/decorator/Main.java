package org.designpattern.structural.decorator;

import org.designpattern.structural.decorator.impl.BaseLoan;
import org.designpattern.structural.decorator.impl.InsuranceDecorator;
import org.designpattern.structural.decorator.impl.Loan;
import org.designpattern.structural.decorator.impl.ProcessingFeeDecorator;

public class Main {
    public static void main(String[] args) {
        Loan basicLoan = new BaseLoan(10000, 10.0);

        Loan loanWithInsurance = new InsuranceDecorator(basicLoan, 1000);
        Loan fullyDecoratedLoan = new ProcessingFeeDecorator(loanWithInsurance, 100);

        System.out.println("Description: " + fullyDecoratedLoan.getDescription());
        System.out.println("Total Cost: " + fullyDecoratedLoan.calculatePayment());
    }
}
