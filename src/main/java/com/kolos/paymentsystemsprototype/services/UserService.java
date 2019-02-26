package com.kolos.paymentsystemsprototype.services;

import com.kolos.paymentsystemsprototype.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends JpaRepository<User, Long> {
}
