package com.company;

public class Skeletion extends Boss {
    int kolStrel;

    public int getKolStrel() {
        return kolStrel;
    }

    public void setKolStrel(int kolStrel) {
        this.kolStrel = kolStrel;
    }

    @Override
    public String printinlnfo() {
        return super.printinlnfo()+ " "+ kolStrel;
    }
}
