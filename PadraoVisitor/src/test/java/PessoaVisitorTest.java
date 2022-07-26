import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaVisitorTest {

    @Test
    void deveExibirColaborador() {
        Colaborador colaborador = new Colaborador(150, "Aline", new Cargo("Analista de qualidade de software"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Colaborador{matrícula=150, nome='Aline', cargo=Analista de qualidade de software}", visitor.exibir(colaborador));
    }

    @Test
    void deveExibirGestor() {
        Gestor gestor = new Gestor(100, "Sara", "Gestora de Qualidade de software");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gestor{matrícula=100, nome='Sara', titulação='Gestora de Qualidade de software'}", visitor.exibir(gestor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(200, "João", 3000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionário{código=200, nome='João', salário=3000.0}", visitor.exibir(funcionario));
    }
}
