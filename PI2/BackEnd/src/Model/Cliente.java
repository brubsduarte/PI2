
package Model;

public class Cliente {

    private int id;
    private String nome;
    private long cpf;

    public long getCPF() {
        return cpf;
    }

    public void setCPF(long pCPF) {
        this.cpf = pCPF;
    }
    
     public Cliente() {
    }

    public Cliente(int id, String pNome, long pCPF) {
        this.id = id;
        this.nome = pNome;
        this.cpf = pCPF;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }   
}
