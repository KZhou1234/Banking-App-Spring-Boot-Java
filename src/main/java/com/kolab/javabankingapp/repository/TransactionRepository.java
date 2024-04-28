package com.kolab.javabankingapp.repository;

import com.kolab.javabankingapp.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

}
