package br.com.versatil.objeto.modelo;
public class Carro {
    //VARIAVEIS, OU ATRIBUTOS DO OBJETO CARRO
    private String modelo;
    private String fabricante;
    private String cor;
    private Integer ano;
    //METODOS GETTER E SETTER
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
