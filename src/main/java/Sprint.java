import java.sql.Date;

public class Sprint {
    private String ID;
    private Date dataInicio;
    private Date dataFim;
    private Pessoa lider;
    private String status;
    
    public Sprint(String iD, Date dataInicio, Date dataFim, Pessoa lider, String status) {
        ID = iD;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.lider = lider;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void atualizaStatus() {
        status = "finalizado";
    }
}
