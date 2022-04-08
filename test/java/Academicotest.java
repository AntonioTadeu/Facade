mport static org.junit.jupiter.api.Assertions.*;

class AcademicoTest {

    @Test
    void deveRetornarPendencinotasFormatura() {
       Academico Academico = new Academico();
        Nota.getInstancia().addAcademicoPendente(aluno);

        assertEquals(false, Academico.formar());
    }

    @Test
    void deveRetornarPendenciaFaltasFormatura() {
        Academico Academico = new Academico();
        Faltas.getInstancia().addAcademicoPendente(Academico);

        assertEquals(false, Academico.formar());
    }

    @Test
    void deveRetornarAlunoSemPendenciaFormatura() {
       Academico Academico = new Academico();

        assertEquals(true,Academico.formar());
    }

}