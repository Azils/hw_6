package com.company;

public class Boss extends GameEntity {
  String weapon;

    public String getWeapon(int health, int uron, String weapon) {
        return weapon;

    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String printinlnfo(){
    return healht+ " "+ uron + " "+ weapon;
    }
}

