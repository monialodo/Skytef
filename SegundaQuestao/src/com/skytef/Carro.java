package com.skytef;

import javax.swing.*;

public class Carro  extends Veiculo {

    public Carro() {
        super();
    }

    @Override
    public String getModelo() {
        return "Porsche 911";
    }

    @Override
    public String getCombustivel() {
        return "Gasolina";
    }


    @Override
    public Integer getAno() {
        return 2018;
    }


    @Override
    public Integer getVelocidade() {
        return 330;
    }


    @Override
    public Double getConsumo() {
        return 7.0;
    }

    @Override
    void acelerar () {
        JOptionPane.showMessageDialog(null,
                "Acelerando o carro...");
    }

    @Override
    void frear () {
        JOptionPane.showMessageDialog(null,
                "Freando o carro...");
    }

}
