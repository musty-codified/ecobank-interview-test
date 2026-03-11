package com.ecobank.ecobank.services;

import com.ecobank.ecobank.dto.TransferDto;

public interface AccountService {
    void validateAccount(TransferDto request);
}
