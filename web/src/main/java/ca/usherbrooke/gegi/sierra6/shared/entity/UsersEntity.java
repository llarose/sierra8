package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class UsersEntity {
    private String cip;
    private String userFirstname;
    private String userLastname;
    private String userEmail;
    private Date userRegistration;

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserRegistration() {
        return userRegistration;
    }

    public void setUserRegistration(Date userRegistration) {
        this.userRegistration = userRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (cip != null ? !cip.equals(that.cip) : that.cip != null) return false;
        if (userFirstname != null ? !userFirstname.equals(that.userFirstname) : that.userFirstname != null)
            return false;
        if (userLastname != null ? !userLastname.equals(that.userLastname) : that.userLastname != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userRegistration != null ? !userRegistration.equals(that.userRegistration) : that.userRegistration != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cip != null ? cip.hashCode() : 0;
        result = 31 * result + (userFirstname != null ? userFirstname.hashCode() : 0);
        result = 31 * result + (userLastname != null ? userLastname.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userRegistration != null ? userRegistration.hashCode() : 0);
        return result;
    }
}
