package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface responsável por comunicar com o banco de dados
 * @Author Kevin Gabriel Alves de Melo
 * @Since 31/08/2021
 */
public interface EmailRepository extends CrudRepository<EmailModel, String> {}