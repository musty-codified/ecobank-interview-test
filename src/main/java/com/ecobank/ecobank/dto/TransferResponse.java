package com.ecobank.ecobank.dto;

import java.math.BigDecimal;

public class TransferResponse {

    private String transferReference;

    public TransferResponse() {
    }

    public TransferResponse(String transferReference) {
        this.transferReference = transferReference;
    }

    public String getTransferReference() {
        return transferReference;
    }

    public void setTransferReference(String transferReference) {
        this.transferReference = transferReference;
    }
}
