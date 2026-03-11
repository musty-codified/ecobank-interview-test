package com.ecobank.ecobank.dto;

import java.math.BigDecimal;

public class TransferDto {
    private BigDecimal amount;
    private String currency;
    private String sender;
    private String beneficiary;

    public TransferDto() {
    }

    public TransferDto(BigDecimal amount, String currency, String sender, String beneficiary) {
        this.amount = amount;
        this.currency = currency;
        this.sender = sender;
        this.beneficiary = beneficiary;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }
}
