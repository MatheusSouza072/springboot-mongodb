package com.matheus.springbootmng.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.matheus.springbootmng.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}