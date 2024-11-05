package org.designpattern.structural.adapter;

import org.designpattern.structural.adapter.impl.ExternalLoanAdapter;
import org.designpattern.structural.adapter.impl.ExternalLoanService;

public class Main {
    public static void main(String[] args) {
        ExternalLoanService externalLoanService = new ExternalLoanService();

        //Created a wrapper over the actual service, so that we have a response as you expect
        ExternalLoanAdapter externalLoanAdapter = new ExternalLoanAdapter(externalLoanService);

        System.out.println(externalLoanAdapter.calculateLoanPayment(10.10, 10));
    }
}
