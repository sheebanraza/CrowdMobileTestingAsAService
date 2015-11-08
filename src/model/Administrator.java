package model;

import javax.persistence.*;

/**
 * Created by Sheeban on 11/7/2015.
 */

@Entity
public class Administrator {

    @Id
    @GeneratedValue
    private Integer adminID;

    @Column
    private String roles;

    @Column
    private String authorization;

    @Column
    private String security;

    public Administrator() {
    }

    public Integer getAdminID() {
        return adminID;
    }

    public void setAdminID(Integer adminID) {
        this.adminID = adminID;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adminID=" + adminID +
                ", roles='" + roles + '\'' +
                ", authorization='" + authorization + '\'' +
                ", security='" + security + '\'' +
                '}';
    }
}
