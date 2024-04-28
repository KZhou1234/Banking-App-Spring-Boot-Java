package com.kolab.javabankingapp.service.impl;

import com.kolab.javabankingapp.dto.TransactionDto;
import com.kolab.javabankingapp.entity.Transaction;
import com.kolab.javabankingapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("Success")
                .build();
        transactionRepository.save(transaction);
        System.out.println("transaction saved");
    }
}
