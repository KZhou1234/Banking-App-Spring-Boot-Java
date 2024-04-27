package com.kolab.javabankingapp.service.impl;

import com.kolab.javabankingapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
