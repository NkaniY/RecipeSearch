package jp.co.nkaniy.recipesearch;

import java.io.Serializable;

public class ItemsModel implements Serializable {

    private String name;
    private String recipe;
    private String category;
    private int image;

    public ItemsModel(String name, String recipe,String category,int image) {
        this.name = name;
        this.recipe = recipe;
        this.image = image;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getCategory() {
        return category;
    }

    public ItemsModel(String category) {
        this.category = category;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
