package com.technews.technewsjavaapi.repository;
import com.technews.technewsjavaapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEMail(String email) throws Exception;
}
