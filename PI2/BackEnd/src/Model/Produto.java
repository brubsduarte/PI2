package Model;

public class Produto {
    
    private int idProduto;
    private String titulo;
    private String genero;
    private String editora;
    private String autor;
    private String tipo;
    private String descricao;
    private int quantidade;
    private double valorUni;
    
    
    
    
    
    public Produto() {
    }

    public Produto(int idProduto, String titulo, String genero,String editora,String autor,String tipo,
            String descricao,int quantidade,double valorUni  ) {
       
        this.idProduto = idProduto;
        this.titulo = titulo;
        this.genero = genero;
        this.editora = editora;
        this.autor = autor;
        this.tipo = tipo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUni = valorUni;
        
        
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the titulo
     */
    public String gettitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the genero
     */
    public String getgenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setgenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the editora
     */
    public String geteditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void seteditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the autor
     */
    public String getautor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setautor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the tipo
     */
    public String gettipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descricao
     */
    public String getdescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the quantidade
     */
    public int getquantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUni
     */
    public double getvalorUni() {
        return valorUni;
    }

    /**
     * @param valorUni the valorUni to set
     */
    public void setvalorUni(double valorUni) {
        this.valorUni = valorUni;
    }

}
