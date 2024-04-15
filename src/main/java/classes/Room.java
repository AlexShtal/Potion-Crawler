package main.java.classes;

import main.java.abstracts.ARoom;

public class Room extends ARoom{
    int x, y;
    private Monster monster = null;
    private Chest chest = null;


    public Room(int x_pos, int y_pos) {
        x = x_pos;
        y = y_pos;

        if (Math.random() < 10.3){
            monster = new Monster();
        }

        if (Math.random() < 0.8){
            chest = new Chest();
        }
    }

    public int[] getPosition(){
        return new int[]{x, y};
    }

    public Monster getMonster(){
        return monster;
    }

    public Chest getChest(){
        return chest;
    }
}
