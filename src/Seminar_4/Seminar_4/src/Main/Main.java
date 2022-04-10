package Seminar_4.Seminar_4.src.Main;

import Seminar_4.Seminar_4.src.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton secondSingleton=Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(secondSingleton);
    }
}
