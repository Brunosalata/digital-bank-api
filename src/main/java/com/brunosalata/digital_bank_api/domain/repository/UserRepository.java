package com.brunosalata.digital_bank_api.domain.repository;

import com.brunosalata.digital_bank_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}
