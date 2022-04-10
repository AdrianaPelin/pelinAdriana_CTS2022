package Seminar5.src.main_builder;

import Seminar5.src.builder.Autobuz;
import Seminar5.src.builder.AutobuzBuilder;

public class Program {
    public static void main(String[] args) {

        AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
        autobuzBuilder.setAreOpriri(false);
        autobuzBuilder.setDeschideUsi(false);

        Autobuz autobuz=autobuzBuilder.build();

        System.out.println(autobuz);

    }
}
