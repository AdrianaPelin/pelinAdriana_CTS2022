package Seminar_4.Seminar_4.src.factoryMethod;

public class Tramvai extends MijlocTransport {
    public Tramvai(int nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai "+nrInmatriculare;
    }
}
