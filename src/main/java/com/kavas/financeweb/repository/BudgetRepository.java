package com.kavas.financeweb.repository;
import com.kavas.financeweb.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepository extends JpaRepository<Budget,Long> {
    List<Budget> findByUserId(Long userId);
}
