package org.designpattern.creational.builder;

import org.designpattern.creational.abstractfactory.enums.LoanType;

import java.time.LocalDateTime;

public class LoanModel {
    private String id;
    private LoanType type;
    private double amount;
    private double interestRate;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String borrowerId;

    public LoanModel(String id, LoanType type, double amount, double interestRate, String status, LocalDateTime startDate, LocalDateTime endDate, String borrowerId) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.interestRate = interestRate;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.borrowerId = borrowerId;
    }

    public String getId() {
        return id;
    }

    public LoanType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public static class Builder {
        private String id;
        private LoanType type;
        private double amount;
        private double interestRate;
        private String status;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private String borrowerId;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withType(LoanType type){
            this.type = type;
            return this;
        }

        public Builder withAmount(double amount){
            this.amount = amount;
            return this;
        }

        public Builder withInterestRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public Builder withStatus(String status){
            this.status = status;
            return this;
        }

        public Builder withStartDate(LocalDateTime startDate){
            this.startDate = startDate;
            return this;
        }

        public Builder withEndDate(LocalDateTime endDate){
            this.endDate = endDate;
            return this;
        }

        public Builder withBorrowerId(String borrowerId){
            this.borrowerId = borrowerId;
            return this;
        }

        public LoanModel build(){
            return new LoanModel(this.id, this.type, this.amount, this.interestRate, this.status, this.startDate, this.endDate, this.borrowerId);
        }
    }

    @Override
    public String toString() {
        return "LoanModel{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", amount=" + amount +
                ", interestRate=" + interestRate +
                ", status='" + status + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", borrowerId='" + borrowerId + '\'' +
                '}';
    }
}
