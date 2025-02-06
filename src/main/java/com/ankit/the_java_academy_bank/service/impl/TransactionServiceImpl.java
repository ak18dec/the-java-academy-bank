package com.ankit.the_java_academy_bank.service.impl;

import com.ankit.the_java_academy_bank.dto.TransactionDto;
import com.ankit.the_java_academy_bank.entity.Transaction;
import com.ankit.the_java_academy_bank.repository.TransactionRepository;
import com.ankit.the_java_academy_bank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;


    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");
    }


}
