package padroesestruturais.facade;

import java.util.ArrayList;

public class Nota extends Setor {

    private static Nota Nota = new Nota();

    private Nota() {};

    public static Nota getNota() {
        return Nota;
    }
}
