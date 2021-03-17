package com.jiankowalski.hrpayroll.domain.model;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Objects;

public class Worker { 
    private Long id;
    private String name;
    private BigDecimal dailyIncome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id.equals(worker.id);
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setDailyIncome(@NonNull BigDecimal dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getDailyIncome() {
        return dailyIncome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Deprecated
    public Worker() {
    }

    public Worker(@NonNull String name,@NonNull BigDecimal dailyIncome) {
        setName(name);
        setDailyIncome(dailyIncome);
    }
}
