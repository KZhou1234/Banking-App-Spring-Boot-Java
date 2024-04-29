package com.kolab.javabankingapp.service.impl;

import com.kolab.javabankingapp.dto.TransactionDto;
import org.springframework.stereotype.Component;

@Component
public interface TransactionService {
    void saveTransaction(TransactionDto transaction);
}
