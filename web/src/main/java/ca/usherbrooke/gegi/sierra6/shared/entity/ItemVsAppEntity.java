package ca.usherbrooke.gegi.sierra6.shared.entity;

/**
 * Created by LAL on 20/05/2015.
 */
public class ItemVsAppEntity {
    private int appId;
    private int itemId;

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemVsAppEntity that = (ItemVsAppEntity) o;

        if (appId != that.appId) return false;
        if (itemId != that.itemId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appId;
        result = 31 * result + itemId;
        return result;
    }
}
