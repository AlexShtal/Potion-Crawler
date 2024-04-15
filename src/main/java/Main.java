package main.java;


import main.java.classes.Floor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Floor> dungeon = new ArrayList<Floor>();

        dungeon.add(new Floor(2, 2));

        System.out.println(dungeon.get(0).getRoom(0, 0).getMonster().getName());
    }
}
