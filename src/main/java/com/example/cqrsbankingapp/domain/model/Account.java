package com.example.cqrsbankingapp.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "accounts")
@Entity
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private UUID id;

    private String number;

    private BigDecimal balance;

}