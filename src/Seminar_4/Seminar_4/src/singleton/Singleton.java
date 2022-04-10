package Seminar_4.Seminar_4.src.singleton;

public class Singleton {
    private static Singleton instanta=null;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(instanta==null)
        {
            instanta=new Singleton();
        }
        return instanta;
    }
}
