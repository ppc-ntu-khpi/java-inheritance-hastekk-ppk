package test;

import domain.Animal;
import domain.Raccoon;


public class TestAnimal {

    public static void main(String[] args) {
        Raccoon raccoon = new Raccoon("Julli");
        System.out.println(raccoon);
        raccoon.hunting();

    }
}
