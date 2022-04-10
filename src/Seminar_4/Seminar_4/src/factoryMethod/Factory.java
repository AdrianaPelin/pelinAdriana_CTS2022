package Seminar_4.Seminar_4.src.factoryMethod;

import Seminar_4.Seminar_4.src.factoryMethod.MijlocTransport;

public interface Factory {
    MijlocTransport createObject(int nrInmatriculare);
}
