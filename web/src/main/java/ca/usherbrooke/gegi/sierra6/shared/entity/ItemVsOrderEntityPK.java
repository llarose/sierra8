package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.io.Serializable;

/**
 * Created by LAL on 20/05/2015.
 */
public class ItemVsOrderEntityPK implements Serializable {
    private int itemId;
    private int orderId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemVsOrderEntityPK that = (ItemVsOrderEntityPK) o;

        if (itemId != that.itemId) return false;
        if (orderId != that.orderId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemId;
        result = 31 * result + orderId;
        return result;
    }
}
