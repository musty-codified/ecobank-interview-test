package com.ecobank.ecobank.controller;


import com.ecobank.ecobank.dto.TransferDto;
import com.ecobank.ecobank.dto.TransferResponse;
import com.ecobank.ecobank.services.AccountService;
import com.ecobank.ecobank.services.TransferService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TransferController {

   private final TransferService transferService;
   private final AccountService accService;

    public TransferController(TransferService transferService, AccountService accService) {
        this.transferService = transferService;
        this.accService = accService;
    }


    @PostMapping("/transfers")
    public ResponseEntity<?> processTransfer(@RequestBody @Validated TransferDto transferDto){

        // validate account
        accService.validateAccount(transferDto);

        //Check limit
        transferService.checkTransferLimit(transferDto);

        //process transfer
     TransferResponse dto = transferService.processTransfer(transferDto);

        return ResponseEntity.ok(dto);
    }


}
