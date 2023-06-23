package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String marca;
    private String nome;
    private Tamanho tamanho;
    private List<String> itensInclusos;
    private double valor;

    public Produto(String marca, String nome, Tamanho tamanho, List<String> itensInclusos, double valor) {
        this.marca = marca;
        this.nome = nome;
        this.tamanho = tamanho;
        this.itensInclusos = itensInclusos;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<String> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<String> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws IllegalAccessException {
        if(valor > 0){
            this.valor = valor;
        }else{
            throw new IllegalAccessException("Valores devem ser maiores que 0");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", itensInclusos='" + itensInclusos + '\'' +
                ", valor=" + valor +
                '}';
    }
}
