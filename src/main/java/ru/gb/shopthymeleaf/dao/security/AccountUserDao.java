package ru.gb.shopthymeleaf.dao.security;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.thymeleafprepare.entity.security.AccountUser;

import java.util.Optional;

public interface AccountUserDao extends JpaRepository<AccountUser, Long> {

    Optional<AccountUser> findByUsername(String username);

}
