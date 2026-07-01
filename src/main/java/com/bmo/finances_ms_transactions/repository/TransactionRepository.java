package com.bmo.finances_ms_transactions.repository;

/**
 * TransactionRepository
 */

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
  List<Transaction> findByUser(Long useId);
  
}