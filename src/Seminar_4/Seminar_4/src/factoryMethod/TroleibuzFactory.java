package Seminar_4.Seminar_4.src.factoryMethod;

import Seminar_4.Seminar_4.src.factoryMethod.MijlocTransport;
import Seminar_4.Seminar_4.src.factoryMethod.Troleibuz;

public class TroleibuzFactory implements Factory{
    @Override
    public MijlocTransport createObject(int nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
