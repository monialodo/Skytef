package com.skytef;

public abstract class Veiculo {
    public String modelo;
    public String combustivel;
    public Integer ano;
    public Integer velocidade;
    public Double consumo;

    public Veiculo(String modelo, Integer ano, Integer velocidade, String combustivel, Double consumo) {
        super();
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    public Veiculo() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    void acelerar() {

        System.out.println("Acelerando...");
    }

    void frear() {

        System.out.println("Freando...");
    }



}