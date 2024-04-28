package com.kolab.javabankingapp.service.impl;

import com.kolab.javabankingapp.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transaction);
}
