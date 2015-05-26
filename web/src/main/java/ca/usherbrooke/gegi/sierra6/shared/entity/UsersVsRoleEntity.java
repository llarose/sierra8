package ca.usherbrooke.gegi.sierra6.shared.entity;

/**
 * Created by LAL on 20/05/2015.
 */
public class UsersVsRoleEntity {
    private int roleId;
    private String cip;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersVsRoleEntity that = (UsersVsRoleEntity) o;

        if (roleId != that.roleId) return false;
        if (cip != null ? !cip.equals(that.cip) : that.cip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (cip != null ? cip.hashCode() : 0);
        return result;
    }
}
