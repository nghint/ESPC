package org.spc.web.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS")
@Data
public class Account {
    public static final String ROLE_MANAGER = "MANAGER";
    public static final String ROLE_EMPLOYEE = "EMPLOYEE";

    @Id
    @Column(name = "USER_NAME", length = 20, nullable = false)
    private String userName;

    @Column(name = "ENCRYTED_PASSWORD", length = 128, nullable = false)
    private String encrytedPassword;

    @Column(name = "ACTIVE", length = 1, nullable = false)
    private boolean active;

    @Column(name = "USER_ROLE", length = 20, nullable = false)
    private String userRole;

    @Override
    public String toString() {
        return "[" + this.userName + "," + this.encrytedPassword + "," + this.userRole + "]";
    }
}
