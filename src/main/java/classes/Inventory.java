package main.java.classes;

public class Inventory {
    private Inventory inventory = null;

    private Inventory(){

    }

    public Inventory getInventory(){
        if (inventory == null){
            inventory = new Inventory();
        }
        return inventory;
    }
}
