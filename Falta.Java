package padroesestruturais.facade;

public class Faltas extends Setor {

    private static Faltas Faltas = new Faltas();

    private Faltas() {};

    public static Faltas getFaltas() {
        return Faltas;
    }
}
