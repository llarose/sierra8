package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.io.Serializable;

/**
 * Created by LAL on 20/05/2015.
 */
public class ItemVsShoppingCartEntityPK implements Serializable {
    private int itemId;
    private int shoppingCartId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemVsShoppingCartEntityPK that = (ItemVsShoppingCartEntityPK) o;

        if (itemId != that.itemId) return false;
        if (shoppingCartId != that.shoppingCartId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemId;
        result = 31 * result + shoppingCartId;
        return result;
    }
}
