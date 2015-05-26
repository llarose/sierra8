package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class RoleEntity {
    private int roleId;
    private String roleName;
    private Date roleRegistration;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getRoleRegistration() {
        return roleRegistration;
    }

    public void setRoleRegistration(Date roleRegistration) {
        this.roleRegistration = roleRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (roleId != that.roleId) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (roleRegistration != null ? !roleRegistration.equals(that.roleRegistration) : that.roleRegistration != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (roleRegistration != null ? roleRegistration.hashCode() : 0);
        return result;
    }
}
