package app;

import entities.Baraka;
import entities.Character;
import entities.SubZero;

public class Application {
    public static void main(String[] args) {
        Character subZero = new SubZero();
        Character baraka = new Baraka();
        Character opa = new Baraka();
        System.out.println(subZero.slide());
        System.out.println(baraka.djap());
        System.out.println("Opa slide als "+ opa.slide());
        opa  = new SubZero();
        System.out.println("Opa is "+ opa.finsher());

    }
}
