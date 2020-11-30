package com.equalities.cloud.service.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Service-C-Person")
public class Person {
  @Id private String id;
  private String firstName;
  private String lastName;
}
