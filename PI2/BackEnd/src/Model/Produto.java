package Model;

public class Produto {

    private String descriProduto;
    private double valorUnitario;
    private int idProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Produto() {
    }

    public Produto(int idProduto, String dscProduto, double vlrUnitario) {
        this.descriProduto = dscProduto;
        this.valorUnitario = vlrUnitario;
        this.idProduto = idProduto;
    }

    public String getDescriProduto() {
        return descriProduto;
    }

    public void setDescriProduto(String descriProduto) {
        this.descriProduto = descriProduto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
