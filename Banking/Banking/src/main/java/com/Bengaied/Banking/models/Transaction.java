package com.Bengaied.Banking.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction extends AbstractEntity {

  private BigDecimal amount;

  @Enumerated(EnumType.STRING)
  private TransactionType type;

  private String destinationIban;

  @Column(updatable = false)
  private LocalDate transactionDate;

  @ManyToOne
  @JoinColumn(name = "id_user")
  private User user;
}
