package com.financial.manager.service.repository;

import com.financial.manager.service.domain.MoneyMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyMovementRepository extends JpaRepository<MoneyMovement, Long> {
}
