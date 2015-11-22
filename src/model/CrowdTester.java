package model;

import javax.persistence.*;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Entity
public class CrowdTester {

    @Id
    @GeneratedValue
    private Integer testerId;

    @OneToOne
    private User user;

    @OneToOne
    private Ranking ranking;

    @OneToOne
    private Category category;

    @OneToOne
    private Application application;

    public CrowdTester() {
    }

    public Integer getTesterId() {
        return testerId;
    }

    public void setTesterId(Integer testerId) {
        this.testerId = testerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "CrowdTester{" +
                "testerId=" + testerId +
                ", user=" + user +
                ", ranking=" + ranking +
                ", category=" + category +
                ", application=" + application +
                '}';
    }
}
