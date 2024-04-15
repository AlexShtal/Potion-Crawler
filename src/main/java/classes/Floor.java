package main.java.classes;

import java.util.ArrayList;


public class Floor {
    private ArrayList<ArrayList<Room>> rooms;


    public Floor(int x_size, int y_size) {
        this.rooms = new ArrayList<>();
        for (int x_index = 0; x_index < x_size; x_index++) {
            ArrayList<Room> row = new ArrayList<>();
            for (int y_index = 0; y_index < y_size; y_index++) {
                Room room = new Room(x_index, y_index);
                row.add(room);
            }
            rooms.add(row);
        }
    }

    public ArrayList<ArrayList<Room>> getRooms(){
        return this.rooms;
    }

    public int printMap(){
        return 0;
    }

    public Room getRoom(int x_index, int y_index){
        return rooms.get(x_index).get(y_index);
    }
}
