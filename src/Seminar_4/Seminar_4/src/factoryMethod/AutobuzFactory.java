package Seminar_4.Seminar_4.src.factoryMethod;

import Seminar_4.Seminar_4.src.factoryMethod.Autobuz;
import Seminar_4.Seminar_4.src.factoryMethod.MijlocTransport;

public class AutobuzFactory  implements Factory{
    @Override
    public MijlocTransport createObject(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
