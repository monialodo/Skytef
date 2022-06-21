package com.skytef;

import javax.swing.*;

public class Moto extends Veiculo {


    public Moto(String modelo, Integer ano, Integer velocidade, String combustivel, Double consumo) {
        super(modelo, ano, velocidade, combustivel, consumo);
    }

    public Moto() {
        super();
    }

    @Override
    public String getModelo() {
        return "Suzuki Hayabusa";
    }

    @Override
    public String getCombustivel() {
        return "Gasolina";
    }


    @Override
    public Integer getAno() {
        return 2008;
    }


    @Override
    public Integer getVelocidade() {
        return 312;
    }


    @Override
    public Double getConsumo() {
        return 18.0;
    }


    @Override
    void acelerar () {
        JOptionPane.showMessageDialog(null,
                "Acelerando a moto...");
    }

    @Override
    void frear () {
        JOptionPane.showMessageDialog(null,
                "Freando a moto...");
    }
}
