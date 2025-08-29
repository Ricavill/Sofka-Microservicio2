package com.example.sofkatransaction.transaction;

import com.example.sofkatransaction.auditing.AuditableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;

@Entity
@Table(name = "transaction")
@EntityListeners(AuditingEntityListener.class)
@DynamicUpdate
public class Transaction extends AuditableEntity<Long> {

    private TransactionType transactionType;
    private BigDecimal value;
    private BigDecimal balance;

    public Transaction() {
    }


    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
