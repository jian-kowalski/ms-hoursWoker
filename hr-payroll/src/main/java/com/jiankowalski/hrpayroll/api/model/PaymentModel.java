package com.jiankowalski.hrpayroll.api.model;

import java.math.BigDecimal;

public class PaymentModel {

    private String name;
    private BigDecimal dailyIncome;
    private Integer days;
    private BigDecimal total;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getDailyIncome() {
        return dailyIncome;
    }
    public void setDailyIncome(BigDecimal dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dailyIncome == null) ? 0 : dailyIncome.hashCode());
        result = prime * result + ((days == null) ? 0 : days.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PaymentModel other = (PaymentModel) obj;
        if (dailyIncome == null) {
            if (other.dailyIncome != null)
                return false;
        } else if (!dailyIncome.equals(other.dailyIncome))
            return false;
        if (days == null) {
            if (other.days != null)
                return false;
        } else if (!days.equals(other.days))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
}
