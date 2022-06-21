package com.skytef;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        Moto moto = new Moto();
        Carro carro = new Carro();


        String resposta = JOptionPane.showInputDialog("Qual veículo deseja? Carro ou Moto?");
        boolean validation = resposta.equalsIgnoreCase("moto") || resposta.equalsIgnoreCase("carro");
        try {
            if (validation) {
                JOptionPane.showMessageDialog(null,
                    "Você escolheu " + resposta + ". Confira as características");
            }
            if (!validation) {
                throw new Exception("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Você não escolheu nenhum veículo. Tente novamente.");
        }

        if (resposta.equalsIgnoreCase("moto")) {
            String printMoto = "Modelo: " + moto.getModelo() + "\n" +
                "Combustivel: " + moto.getCombustivel() + "\n" +
                "Ano de Fabricação: " + moto.getAno() + "\n" +
                "Velocidade máxima: " + moto.getVelocidade() + " km/h" + "\n" +
                "Consumo: " + moto.getConsumo() + " km/lt";
            JOptionPane.showMessageDialog(null, printMoto);

            String expMoto = JOptionPane.showInputDialog("Deseja experimentar com o veículo?");

            try {
                if (expMoto.equalsIgnoreCase("sim") || expMoto.equalsIgnoreCase("s")) {
                    moto.acelerar();
                    moto.frear();
                    JOptionPane.showMessageDialog(null, "Obrigada. Saindo do programa.");
                } else {
                    throw new Exception("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Obrigada. Saindo do programa.");
            }
        }

        if (resposta.equalsIgnoreCase("carro")) {
            String printCarro = "Modelo: " + carro.getModelo() + "\n" +
                "Combustivel: " + carro.getCombustivel() + "\n" +
                "Ano de Fabricação: " + carro.getAno() + "\n" +
                "Velocidade máxima: " + carro.getVelocidade() + " km/h" + "\n" +
                "Consumo: " + carro.getConsumo() + " km/lt";
            JOptionPane.showMessageDialog(null, printCarro);

            String expCarro = JOptionPane.showInputDialog("Deseja experimentar com o veículo?");
            try {
                if (expCarro.equalsIgnoreCase("sim") || expCarro.equalsIgnoreCase("s")) {
                    carro.acelerar();
                    carro.frear();
                    JOptionPane.showMessageDialog(null, "Obrigada. Saindo do programa.");

                } else {
                    throw new Exception("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Obrigada. Saindo do programa.");
            }
        }
    }
}