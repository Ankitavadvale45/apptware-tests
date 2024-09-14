package com.apptware.interview.jpa.employee;

import jakarta.persistence.*;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity     //this annotation helps in identifying employee entity
class Employee {


  @Id      // below annotation helps in identifying unique key
  private UUID id;
  private String name;
}



