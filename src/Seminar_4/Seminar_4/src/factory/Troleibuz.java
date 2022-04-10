package Seminar_4.Seminar_4.src.factory;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Troleibuz "+nrInmatriculare;
    }
}
