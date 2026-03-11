package com.ecobank.ecobank.services;


import com.ecobank.ecobank.dto.TransferDto;
import com.ecobank.ecobank.dto.TransferResponse;
import com.ecobank.ecobank.entities.Transfer;
import com.ecobank.ecobank.repositories.TransferRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionEngine {
    private final TransferRepository repository;

    public TransactionEngine(TransferRepository repository) {
        this.repository = repository;
    }

    public TransferResponse execute(TransferDto transferDto){
        Transfer transfer = new Transfer();
        transfer.setAmount(transferDto.getAmount());
        transfer.setBeneficiary(transferDto.getBeneficiary());
        transfer.setCurrency(transferDto.getCurrency());
        transfer.setSender(transferDto.getSender());

        repository.save(transfer);

        return new TransferResponse(
                transfer.getReference()
        );
    }
}
