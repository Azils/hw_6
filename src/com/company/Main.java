package com.company;

public class Main {

    public static void main(String[] args) {

	Boss boss = new Boss();
	boss.healht=400;
	boss.uron=25;
	boss.weapon= "Автомат";
        System.out.println(boss.healht+ " "+ boss.uron+ " " + boss.weapon);
		System.out.println(boss.printinlnfo());
		Skeletion skeletion = new Skeletion();
		skeletion.healht=600;
		skeletion.uron=100;
		skeletion.weapon="Калашников";
		skeletion.kolStrel=10;
		System.out.println("Скелет: "+skeletion.healht+ " "+ skeletion.uron+ " "+ skeletion.weapon+ " "+ skeletion.kolStrel);
		Skeletion skeletion1 = new Skeletion();
		skeletion1.setHealht(700);
		skeletion1.setUron(80);
		skeletion1.setWeapon("K2");
		skeletion1.setKolStrel(20);
		System.out.println("Скелет1: "+skeletion1.healht+ " "+ skeletion1.uron+ " "+ skeletion1.weapon+ " "+ skeletion1.kolStrel);

    }
}
