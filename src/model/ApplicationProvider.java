package model;

import javax.lang.model.type.IntersectionType;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Sheeban on 11/6/2015.
 */


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ApplicationProvider {

    @Id
    @GeneratedValue
    private Integer applicationProviderId;

    @Column
    private Integer numberOfApplication;

    @OneToOne
    private User user;

    @OneToMany
    private List<Application> applicationList;

    public Integer getApplicationProviderId() {
        return applicationProviderId;
    }

    public void setApplicationProviderId(Integer applicationProviderId) {
        this.applicationProviderId = applicationProviderId;
    }

    public Integer getNumberOfApplication() {
        return numberOfApplication;
    }

    public void setNumberOfApplication(Integer numberOfApplication) {
        this.numberOfApplication = numberOfApplication;
    }

    public List<Application> getApplicationList() {
        return applicationList;
    }

    public void setApplicationList(List<Application> applicationList) {
        this.applicationList = applicationList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private ApplicationProvider() {
    }

    @Override
    public String toString() {
        return "ApplicationProvider{" +
                "applicationProviderId=" + applicationProviderId +
                ", numberOfApplication=" + numberOfApplication +
                ", user=" + user +
                ", applicationList=" + applicationList +
                '}';
    }
}

