package org.designpattern.creational.builder;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        LoanModel loanModel = new LoanModel.Builder()
                .withId("test")
                .withBorrowerId(UUID.randomUUID().toString())
                .withAmount(1000.1)
                .build();

        LoanModel loanModel2 = new LoanModel.Builder()
                .withId("testId2")
                .withBorrowerId(UUID.randomUUID().toString())
                .withAmount(2222.2)
                .build();

        System.out.println(loanModel);
        System.out.println(loanModel2);
    }
}
