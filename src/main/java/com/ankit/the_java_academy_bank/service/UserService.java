package com.ankit.the_java_academy_bank.service;

import com.ankit.the_java_academy_bank.dto.BankResponse;
import com.ankit.the_java_academy_bank.dto.CreditDebitRequest;
import com.ankit.the_java_academy_bank.dto.EnquiryRequest;
import com.ankit.the_java_academy_bank.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
