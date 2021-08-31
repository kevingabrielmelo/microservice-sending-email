package com.ms.email.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Classe responsável por validar o e-mail
 * @Author Kevin Gabriel Alves de Melo
 * @Since 31/08/2021
 */
@Data
public class EmailDto {

    @NotBlank
    private String OwnerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
