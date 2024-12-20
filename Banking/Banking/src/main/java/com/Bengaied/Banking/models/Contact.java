package com.Bengaied.Banking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Ali Bouali
 * @since 12.09.22
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contact extends AbstractEntity {

  private String firstname;

  private String lastname;

  private String email;

  private String iban;

  @ManyToOne
  @JoinColumn(name = "id_user")
  private User user;

}
