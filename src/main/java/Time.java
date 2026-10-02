import java.util.List;

public class Time {
    private String ID;
    private String nome;
    private List<Sprint> sprints;
    private List<Pessoa> funcionarios;
    private Pessoa gerente;

    public Time(String iD, String nome, Pessoa gerente) {
        ID = iD;
        this.nome = nome;
        this.gerente = gerente;
    }

     public void cadastrarSprint(Sprint sprint) {
        sprints.add(sprint);
    }

    public void cadastrarFuncionario(Pessoa funcionario) {
        funcionarios.add(funcionario);
    }

    public void cadastrarGerente(Pessoa gerente) {
        this.gerente = gerente;
    }

    public void finalizarSprint(Sprint sprint) {
    sprint.atualizaStatus();
    }
}
