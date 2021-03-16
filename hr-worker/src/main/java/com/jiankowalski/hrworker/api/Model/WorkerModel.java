package com.jiankowalski.hrworker.api.Model;

import java.math.BigDecimal;

public class WorkerModel {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setDailyIncome(BigDecimal dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDailyIncome() {
        return dailyIncome;
    }

    private BigDecimal dailyIncome;
}
