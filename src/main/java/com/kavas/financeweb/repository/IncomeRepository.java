package com.kavas.financeweb.repository;

import com.kavas.financeweb.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IncomeRepository extends JpaRepository <Income,Long> {

    List<Income> findByUserId(Long id);

}
