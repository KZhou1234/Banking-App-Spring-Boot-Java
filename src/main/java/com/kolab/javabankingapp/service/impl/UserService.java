package com.kolab.javabankingapp.service.impl;

import com.kolab.javabankingapp.dto.BankResponse;
import com.kolab.javabankingapp.dto.CreditDebitRequest;
import com.kolab.javabankingapp.dto.EnquiryRequest;
import com.kolab.javabankingapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest enquiryRequest);

    String nameEnquiry(EnquiryRequest enquiryRequest);

    BankResponse creditAccount(CreditDebitRequest request);

    BankResponse debitAccount(CreditDebitRequest request);

}
