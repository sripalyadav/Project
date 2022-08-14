package com.sripal.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sripal.entity.User;

public interface UserRepository extends JpaRepository<User, Serializable> {

}
