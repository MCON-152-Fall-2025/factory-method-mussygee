package com.mcon152.recipeshare;
import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("SOUP")

public class SoupRecipe extends Recipe {
    private Integer spiceLevel;

    public Integer getSpiceLevel() {return spiceLevel; }
    public void setSpiceLevel(Integer spiceLevel) {this.spiceLevel = spiceLevel; }
}
