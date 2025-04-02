package com.email.email_writer.App;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}