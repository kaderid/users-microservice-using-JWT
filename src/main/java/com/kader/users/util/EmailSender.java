package com.kader.users.util;

public interface EmailSender {
    void sendEmail(String toEmail, String body);
}