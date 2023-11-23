package com.kavas.financeweb.service;

import com.kavas.financeweb.model.Expense;
import com.kavas.financeweb.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public List<Expense> getExpensesByUserId(Long id){
        return expenseRepository.findByUserId(id);
    }
    public Optional<Expense> getExpenseById(Long id){
        return expenseRepository.findById(id);
    }
    public Expense createExpense(Expense expense){
        return expenseRepository.save(expense);
    }
    public Expense updateExpense(Long id,Expense updatedExpense){
        updatedExpense.setId(id);
        return expenseRepository.save(updatedExpense);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

}
