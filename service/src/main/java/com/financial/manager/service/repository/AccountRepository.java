package com.financial.manager.service.repository;

import com.financial.manager.service.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findAllByActiveIsTrue();

    @Modifying
    @Query("update Account A set A.active = false where A.id = :id")
    void deactivateAccount(@Param("id") Long id);
}
