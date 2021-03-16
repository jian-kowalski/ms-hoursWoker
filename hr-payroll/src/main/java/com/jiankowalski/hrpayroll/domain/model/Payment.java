package com.jiankowalski.hrpayroll.domain.model;

import java.math.BigDecimal;

public class Payment {

    private final String name;
    private final BigDecimal dailyIncome;
    private final Integer days;
    private BigDecimal total;
    
    public String getName() {
        return name;
    }
    
    public BigDecimal getDailyIncome() {
        return dailyIncome;
    }
  
    public Integer getDays() {
        return days;
    }
   
    public BigDecimal getTotal(){
        total = (dailyIncome.multiply(BigDecimal.valueOf(days))); 
        return total;
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
        Payment other = (Payment) obj;
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
    
    public Payment(String name, BigDecimal dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }
    
}
