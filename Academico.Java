package padroesestruturais.facade;

import java.text.Normalizer;

public class Academico {

    public boolean formar() {
        return AcademicoFacade.verificarPendenciasFormatura(this);
    }
}
