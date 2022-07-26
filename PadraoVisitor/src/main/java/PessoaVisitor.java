public class PessoaVisitor  implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirColaborador(Colaborador colaborador) {
        return "Colaborador{" +
                "matrícula=" + colaborador.getMatricula() +
                ", nome='" + colaborador.getNome() + '\'' +
                ", cargo=" + colaborador.getNomeCargo() +
                '}';
    }

    @Override
    public String exibirGestor(Gestor gestor) {
        return "Gestor{" +
                "matrícula=" + gestor.getMatricula() +
                ", nome='" + gestor.getNome() + '\'' +
                ", titulação='" + gestor.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionário{" +
                "código=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salário=" + funcionario.getSalario() +
                '}';
    }
}
