package com.equalities.cloud.service.persistence;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.equalities.cloud.service.persistence.model.Person;

@RepositoryRestResource(
    collectionResourceRel = "peopleServiceB",
    collectionResourceDescription = @Description("Person entries of service B"),
    path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {
  List<Person> findByLastName(@Param("name") String name);
}
