package ca.usherbrooke.gegi.sierra6.shared.entity;

import java.sql.Date;

/**
 * Created by LAL on 20/05/2015.
 */
public class CategoryEntity {
    private int categoryId;
    private String categoryName;
    private Date categoryRegistration;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCategoryRegistration() {
        return categoryRegistration;
    }

    public void setCategoryRegistration(Date categoryRegistration) {
        this.categoryRegistration = categoryRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (categoryId != that.categoryId) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (categoryRegistration != null ? !categoryRegistration.equals(that.categoryRegistration) : that.categoryRegistration != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (categoryRegistration != null ? categoryRegistration.hashCode() : 0);
        return result;
    }
}
