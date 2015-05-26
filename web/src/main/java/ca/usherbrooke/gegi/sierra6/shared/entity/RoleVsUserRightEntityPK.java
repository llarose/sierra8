package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.io.Serializable;

/**
 * Created by LAL on 20/05/2015.
 */
public class RoleVsUserRightEntityPK implements Serializable {
    private int roleId;
    private int userRightId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUserRightId() {
        return userRightId;
    }

    public void setUserRightId(int userRightId) {
        this.userRightId = userRightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleVsUserRightEntityPK that = (RoleVsUserRightEntityPK) o;

        if (roleId != that.roleId) return false;
        if (userRightId != that.userRightId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + userRightId;
        return result;
    }
}
