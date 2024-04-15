package main.java.classes;


import java.util.ArrayList;

public class Chest {
    private String potion_recipe = null;
    private ArrayList<String> ingredients = null;

    public Chest(){
        if (Math.random() < 0.2){
            potion_recipe = "Recipe";
        }

        for (int i = 0; i < 5; i++){
            if (Math.random() < 0.1){
                ingredients.add("Recipe");
            }
        }
    }

    public String getPotionRecipe(){
        return potion_recipe;
    }

    public ArrayList<String> ingredients(){
        return ingredients;
    }
}
