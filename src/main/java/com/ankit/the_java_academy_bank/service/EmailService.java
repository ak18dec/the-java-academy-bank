package com.ankit.the_java_academy_bank.service;

import com.ankit.the_java_academy_bank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
