package com.ankit.the_java_academy_bank.service;

import com.ankit.the_java_academy_bank.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
