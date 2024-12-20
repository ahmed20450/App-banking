package com.Bengaied.Banking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address extends AbstractEntity {

  private String street;

  private Integer houseNumber;

  private Integer zipCode;

  private String city;

  private String county;

  @OneToOne
  @JoinColumn(name = "id_user")
  private User user;
}
