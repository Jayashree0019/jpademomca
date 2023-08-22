package com.mca.demo;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String categoryName;
    @ManyToMany
    private Set <Recipe> recipe;
    public Set<Recipe>Recipe(){
        return recipe;
    }

    public  void setRecipe(Set<Recipe>recipe){
        this.recipe=recipe;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
