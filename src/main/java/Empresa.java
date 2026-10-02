import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Time> times;
    private Pessoa productOwner;

    public Empresa(String nome, String cnpj, Pessoa productOwner) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.productOwner = productOwner;
    }

    public void cadastrarTime(Time time) {
        times.add(time);
    }

    public void cadastrarProductOwner(Pessoa productOwner) {
        this.productOwner = productOwner;
    }   
}
