package com.pdw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.pdw.model.User;

@Repository
public interface UserJpaRespository extends JpaRepository<User, Long>{

    User findByName(String name);
}
