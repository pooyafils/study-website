package com.devup.springlearingsite.repository;

import com.devup.springlearingsite.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findById(int id);
}
