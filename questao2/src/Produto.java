public class Produto {
    private double peso, valor, Qtdestoque, codigo, especie, Qtdproduto, tamanho;
    double NovoEstoque, parcelamento, desc, descVenda, VendaTot;
    private String nome, cor;

    public double getQtdproduto() {
        return Qtdproduto;
    }

    public void setQtdproduto(double qtdproduto) {
        this.Qtdproduto = qtdproduto;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQtdestoque() {
        return Qtdestoque;
    }

    public void setQtdestoque(double qtdestoque) {
        Qtdestoque = qtdestoque;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getEspecie() {
        return especie;
    }

    public void setEspecie(double especie) {
        this.especie = especie;
    }
    public void calc(){
        descVenda = (valor*Qtdproduto) * 0.95;
        desc = (valor*Qtdproduto) * 0.05;
        VendaTot = (valor*Qtdproduto);
    }
    public void parc(){

        parcelamento = (valor*Qtdproduto)/3;
    }

    public void est(){

        NovoEstoque = Qtdestoque - Qtdproduto;
    }
}


