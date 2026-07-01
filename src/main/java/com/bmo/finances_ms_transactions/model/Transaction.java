package com.bmo.finances_ms_transactions.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
/**
 * Transaction
 */

@Entity
@Table(name="tb_transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Collumn(nullable = false)
    private Long userId;

    @Collum(nullable = false)
    private String description;

    @Collum(nullable = false)
    private BigDecimal amount;

    @Collum(nullable = false)
    private LocalDateTime date = LocalDateTime.now();


    public Transaction(){
    }

    public Long getId(){
      return id;
    }

    public void setId(Long userId){
      this.userId = userId;
    }

    public Long getUserId(){
      return userId;
    }

    public void setUserId(Long userId){
      this.userId = userId;
    }

    public String getDescription(){
      return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public BigDecimal getAmount(){
      return amount;
    }

    public void getAmount(BigDecimal amout){
      this.amount = amout;
    }
}