package com.ecobank.ecobank.services.impl;

import com.ecobank.ecobank.dto.TransferDto;
import com.ecobank.ecobank.dto.TransferResponse;
import com.ecobank.ecobank.repositories.TransferRepository;
import com.ecobank.ecobank.services.TransactionEngine;
import com.ecobank.ecobank.services.TransferService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class TransferServiceImpl implements TransferService {

    private final TransferRepository transferRepository;
    private final TransactionEngine transactionEngine;

    public TransferServiceImpl(TransferRepository transferRepository, TransactionEngine transactionEngine) {
        this.transferRepository = transferRepository;
        this.transactionEngine = transactionEngine;
    }

    @Override
    public TransferResponse processTransfer(TransferDto dto) {
        String transRef = UUID.randomUUID().toString();
        //check duplicate
        checkDuplicateTransaction(transRef);

       return transactionEngine.execute(dto);
    }

    @Override
    public void checkTransferLimit(TransferDto request) {
        BigDecimal transactionLimit = new BigDecimal(5000000);
        if (request.getAmount().compareTo(transactionLimit) > 0){
            throw new RuntimeException("Transaction limit exceeded");
        }

    }

    private void checkDuplicateTransaction(String transRef){
        if (transferRepository.existsByReference(transRef)){
            throw new RuntimeException("Duplicate transaction");
        }

    }
}
