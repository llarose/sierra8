package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class UserRightEntity {
    private int userRightId;
    private String userRightName;
    private Date userRightRegistration;

    public int getUserRightId() {
        return userRightId;
    }

    public void setUserRightId(int userRightId) {
        this.userRightId = userRightId;
    }

    public String getUserRightName() {
        return userRightName;
    }

    public void setUserRightName(String userRightName) {
        this.userRightName = userRightName;
    }

    public Date getUserRightRegistration() {
        return userRightRegistration;
    }

    public void setUserRightRegistration(Date userRightRegistration) {
        this.userRightRegistration = userRightRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRightEntity that = (UserRightEntity) o;

        if (userRightId != that.userRightId) return false;
        if (userRightName != null ? !userRightName.equals(that.userRightName) : that.userRightName != null)
            return false;
        if (userRightRegistration != null ? !userRightRegistration.equals(that.userRightRegistration) : that.userRightRegistration != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userRightId;
        result = 31 * result + (userRightName != null ? userRightName.hashCode() : 0);
        result = 31 * result + (userRightRegistration != null ? userRightRegistration.hashCode() : 0);
        return result;
    }
}
