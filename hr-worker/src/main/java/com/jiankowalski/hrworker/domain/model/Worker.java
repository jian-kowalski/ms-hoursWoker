package com.jiankowalski.hrworker.domain.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tb_worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "dailyIncome", nullable = false)
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
        return name;
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
