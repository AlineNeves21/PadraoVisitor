public class Colaborador implements Pessoa {

    private int matricula;
    private String nome;
    private Cargo cargo;

    public Colaborador(int matricula, String nome, Cargo cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCargo() {
        return this.cargo.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirColaborador(this);
    }
}
