package com.ecobank.ecobank.services;

import com.ecobank.ecobank.dto.TransferDto;
import com.ecobank.ecobank.dto.TransferResponse;

public interface TransferService {

    TransferResponse processTransfer(TransferDto request);
    void checkTransferLimit(TransferDto request);
}
