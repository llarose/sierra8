package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class ShoppingCartEntity {
    private int shoppingCartId;
    private Date shoppingCartRegistration;
    private String shoppingCartStatus;
    private BigInteger shoppingCartTotalPrice;

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public Date getShoppingCartRegistration() {
        return shoppingCartRegistration;
    }

    public void setShoppingCartRegistration(Date shoppingCartRegistration) {
        this.shoppingCartRegistration = shoppingCartRegistration;
    }

    public String getShoppingCartStatus() {
        return shoppingCartStatus;
    }

    public void setShoppingCartStatus(String shoppingCartStatus) {
        this.shoppingCartStatus = shoppingCartStatus;
    }

    public BigInteger getShoppingCartTotalPrice() {
        return shoppingCartTotalPrice;
    }

    public void setShoppingCartTotalPrice(BigInteger shoppingCartTotalPrice) {
        this.shoppingCartTotalPrice = shoppingCartTotalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCartEntity that = (ShoppingCartEntity) o;

        if (shoppingCartId != that.shoppingCartId) return false;
        if (shoppingCartRegistration != null ? !shoppingCartRegistration.equals(that.shoppingCartRegistration) : that.shoppingCartRegistration != null)
            return false;
        if (shoppingCartStatus != null ? !shoppingCartStatus.equals(that.shoppingCartStatus) : that.shoppingCartStatus != null)
            return false;
        if (shoppingCartTotalPrice != null ? !shoppingCartTotalPrice.equals(that.shoppingCartTotalPrice) : that.shoppingCartTotalPrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shoppingCartId;
        result = 31 * result + (shoppingCartRegistration != null ? shoppingCartRegistration.hashCode() : 0);
        result = 31 * result + (shoppingCartStatus != null ? shoppingCartStatus.hashCode() : 0);
        result = 31 * result + (shoppingCartTotalPrice != null ? shoppingCartTotalPrice.hashCode() : 0);
        return result;
    }
}
