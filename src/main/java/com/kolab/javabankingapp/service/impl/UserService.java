package com.kolab.javabankingapp.service.impl;

import com.kolab.javabankingapp.dto.BankResponse;
import com.kolab.javabankingapp.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);

}