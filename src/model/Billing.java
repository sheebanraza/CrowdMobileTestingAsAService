package model;

import javax.persistence.*;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Entity
public class Billing {

    @Id
    @GeneratedValue
    private Integer billingId;

    @Column
    private Float totalPayment;

    private Billing() {
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public Float getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Float totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "billingId=" + billingId +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
