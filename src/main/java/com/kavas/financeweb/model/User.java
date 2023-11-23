package com.kavas.financeweb.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column
    private String email;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Income> incomes;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Expense> expenses;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Budget> budgets;

}
