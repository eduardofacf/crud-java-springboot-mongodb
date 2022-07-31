package com.eduardofacf.crudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eduardofacf.crudmongo.domain.Register;

@Repository
public interface RegisterRepository extends MongoRepository<Register, String> {

}
