package com.financial.manager.service.repository;

import com.financial.manager.service.domain.FixedExpenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixedExpensesRepository extends JpaRepository<FixedExpenses, Long> {
}
