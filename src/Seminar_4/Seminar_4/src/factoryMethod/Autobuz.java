package Seminar_4.Seminar_4.src.factoryMethod;

public class Autobuz extends MijlocTransport {

    public Autobuz(int nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz "+nrInmatriculare;
    }
}
