package ca.usherbrooke.gegi.sierra6.shared.entity;

/**
 * Created by LAL on 20/05/2015.
 */
public class AppEntity {
    private int appId;
    private String appName;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppEntity appEntity = (AppEntity) o;

        if (appId != appEntity.appId) return false;
        if (appName != null ? !appName.equals(appEntity.appName) : appEntity.appName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appId;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        return result;
    }
}
