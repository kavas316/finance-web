package com.kavas.financeweb.repository;
import com.kavas.financeweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
