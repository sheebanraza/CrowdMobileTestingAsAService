package model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Sheeban on 11/3/2015.
 */

@Entity
public class Application {

    @Id
    @GeneratedValue
    private Integer applicationId;

    @Column
    @OneToOne
    private Category category;

    @Column
    private String currentVersion;

    @OneToOne
    private ApplicationProvider applicationProvider;

    @OneToOne
    private Status status;

    @OneToOne
    private Billing billing;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public ApplicationProvider getApplicationProvider() {
        return applicationProvider;
    }

    public void setApplicationProvider(ApplicationProvider applicationProvider) {
        this.applicationProvider = applicationProvider;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    private Application() {
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationId=" + applicationId +
                ", category=" + category +
                ", currentVersion='" + currentVersion + '\'' +
                ", applicationProvider=" + applicationProvider +
                ", status=" + status +
                ", billing=" + billing +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
