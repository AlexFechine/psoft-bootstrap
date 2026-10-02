public class Pessoa {
    private String nome;
    private String CPF;
    private Funcao funcao;

    public Pessoa(String nome, String cPF, Funcao funcao) {
        this.nome = nome;
        CPF = cPF;
        this.funcao = funcao;
    }

    public Funcao getFuncao() {
        return funcao;
    }
}
