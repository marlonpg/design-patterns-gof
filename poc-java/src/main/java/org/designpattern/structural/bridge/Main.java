package org.designpattern.structural.bridge;

import org.designpattern.structural.bridge.impl.Loan;
import org.designpattern.structural.bridge.impl.MonthlyPaymentSchedule;
import org.designpattern.structural.bridge.impl.PaymentSchedule;
import org.designpattern.structural.bridge.impl.PersonalLoan;
import org.designpattern.structural.bridge.impl.QuarterlyPaymentSchedule;

public class Main {
    public static void main(String[] args) {
        Loan personalLoan = new PersonalLoan(10000, 5.5, 5);
        PaymentSchedule monthlySchedule = new MonthlyPaymentSchedule(personalLoan);
        PaymentSchedule quarterlyPaymentSchedule = new QuarterlyPaymentSchedule(personalLoan);
        System.out.println(monthlySchedule.showLoanDetails());
        System.out.println(quarterlyPaymentSchedule.showLoanDetails());
    }
}
