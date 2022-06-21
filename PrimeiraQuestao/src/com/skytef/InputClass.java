package com.skytef;

import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputClass {

    public static void main(String[] args) {

        JFrame message;

        String input = JOptionPane.showInputDialog("Digite um número");
        Pattern p = Pattern.compile("[A-Z,a-z&%$#@!()*^]");
        Matcher m = p.matcher(input);
        if (m.find()) {
            JOptionPane.showMessageDialog(null, "Por favor digite apenas números");
        }
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor digite um número");
        }

        List < Long > longList = new ArrayList < > ();

        for (int i = 0; i < input.length(); i++) {
            longList.add(Long.parseLong(String.valueOf(input.charAt(i))));
        }


        long size = longList.size() - 1;
        for (int i = 0; i <= size; ++i) {

            Long first = longList.get(i);
            Long second = longList.get(i + 1);
            Long third = longList.get(i + 2);

            if ((first <= size) && (second <= size) && (third <= size)) {
                if ((first.equals(second)) && (second.equals(third))) {

                    message = new JFrame();
                    JOptionPane.showMessageDialog(message, "Há uma sequência de algarismos " +
                        longList.get(i) + " repetidos três vezes consecutivas com início na posição " +
                        longList.indexOf(first));
                }
            }
        }
    }
}