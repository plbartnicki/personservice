package com.klb.dao;

import com.klb.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends MongoRepository<Person, String> {
}
