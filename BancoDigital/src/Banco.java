import java.util.List;

public class Banco {

    public int codBanco;
    public String nomeBanco;
    public int agenciaBanco;
    public int numeroDaConta;
    protected List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(int agenciaBanco) {
        this.agenciaBanco = agenciaBanco;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}
