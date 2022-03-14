package seminar3_CTS;

import java.util.Scanner;

 class AplicantReader {
    public static void citireAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] proiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            proiecte[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumiriProiecte(nrProiecte, proiecte);
    }
}