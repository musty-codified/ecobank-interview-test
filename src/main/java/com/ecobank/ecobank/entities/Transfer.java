package com.ecobank.ecobank.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private String currency;
    private String sender;
    private String beneficiary;

    @Column(unique = true)
    private String reference;

    public Transfer() {
    }

    public Transfer(String currency, BigDecimal amount, String sender, String beneficiary, String ref) {
        this.currency = currency;
        this.amount = amount;
        this.sender = sender;
        this.beneficiary = beneficiary;
        this.reference = ref;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getReference() {
        return reference;

    }



    public void setReference(String reference) {
        this.reference = reference;
    }
}
