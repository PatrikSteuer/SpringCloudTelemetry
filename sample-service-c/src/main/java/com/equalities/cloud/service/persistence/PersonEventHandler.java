package com.equalities.cloud.service.persistence;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.equalities.cloud.service.PersonClient;
import com.equalities.cloud.service.persistence.model.Person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RepositoryEventHandler(Person.class) 
public class PersonEventHandler {
  
  private PersonClient personClient;
  
  public PersonEventHandler(PersonClient personClient) {
    this.personClient = personClient;
  }
  
  @HandleAfterCreate
  public void handlePersonAfterCreate(Person person){
      log.info("Handling Event: After Person Create");
      log.info("Received person: {}", person);
      //personClient.persist(person);
  }
}
