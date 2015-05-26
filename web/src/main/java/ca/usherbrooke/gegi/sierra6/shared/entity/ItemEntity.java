package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class ItemEntity {
    private int itemId;
    private String itemName;
    private Integer itemQuantity;
    private String itemLink;
    private Date itemRegistration;
    private BigInteger itemPrice;
    private String itemDescription;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemLink() {
        return itemLink;
    }

    public void setItemLink(String itemLink) {
        this.itemLink = itemLink;
    }

    public Date getItemRegistration() {
        return itemRegistration;
    }

    public void setItemRegistration(Date itemRegistration) {
        this.itemRegistration = itemRegistration;
    }

    public BigInteger getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigInteger itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemEntity that = (ItemEntity) o;

        if (itemId != that.itemId) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        if (itemQuantity != null ? !itemQuantity.equals(that.itemQuantity) : that.itemQuantity != null) return false;
        if (itemLink != null ? !itemLink.equals(that.itemLink) : that.itemLink != null) return false;
        if (itemRegistration != null ? !itemRegistration.equals(that.itemRegistration) : that.itemRegistration != null)
            return false;
        if (itemPrice != null ? !itemPrice.equals(that.itemPrice) : that.itemPrice != null) return false;
        if (itemDescription != null ? !itemDescription.equals(that.itemDescription) : that.itemDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemId;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (itemQuantity != null ? itemQuantity.hashCode() : 0);
        result = 31 * result + (itemLink != null ? itemLink.hashCode() : 0);
        result = 31 * result + (itemRegistration != null ? itemRegistration.hashCode() : 0);
        result = 31 * result + (itemPrice != null ? itemPrice.hashCode() : 0);
        result = 31 * result + (itemDescription != null ? itemDescription.hashCode() : 0);
        return result;
    }
}
