package com.kavas.financeweb.service;
import com.kavas.financeweb.model.Income;
import com.kavas.financeweb.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class IncomeService {

    private IncomeRepository incomeRepository;
@Autowired
    public IncomeService(IncomeRepository incomeRepository){
        this.incomeRepository = incomeRepository;
    }

    public List<Income> getAllIncomes(){
        return incomeRepository.findAll();
    }
    public Optional<Income> getIncomeById(Long id){
    return incomeRepository.findById(id);
    }

    public Income createIncome(Income income){
    return incomeRepository.save(income);
    }

    public Income updateIncome(Long id, Income updatedIncome) {
        updatedIncome.setId(id);
        return incomeRepository.save(updatedIncome);
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }
}
