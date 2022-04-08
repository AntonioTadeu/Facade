package padroesestruturais.facade;

public class AcademicoFacade {

    public static boolean verificarPendenciasFormatura( Academico Academico) {
        if (Nota.getInstancia().verificarAcademicoComPendencia(aluno)) {
            return false;
        }
        if (Faltas.getInstancia().verificarAcademicoComPendencia(aluno)) {
            return false;
        }
        return true;
    }
}
