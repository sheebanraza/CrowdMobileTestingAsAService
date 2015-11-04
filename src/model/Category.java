package model;

import javax.persistence.*;

/**
 * Created by Sheeban on 11/3/2015.
 */

@Entity
public class Category {

    @Id
    @GeneratedValue
    Integer categoryId;

    @Column
    String categoryName;

    public Category() {
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
