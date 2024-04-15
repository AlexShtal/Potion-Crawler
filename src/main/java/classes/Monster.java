package main.java.classes;

import java.util.HashMap;

public class Monster {
    private String name;
    HashMap<String, Float> vulnerabilities = new HashMap<>();
    

    public Monster(){
        vulnerabilities.put("Frost", 0f);
        vulnerabilities.put("Fire", 0f);
        vulnerabilities.put("Poison", 0f);

        name = "Monster";
    }

    public HashMap<String, Float> getVulnerabilities(){
        return vulnerabilities;
    }

    public String getName(){
        return name;
    }
}
