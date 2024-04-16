package aula18;

/*
C001 Faça um algoritmo que leia dois valores
numéricos e efetue a multiplicação entre eles,
o resultado deve ser apresentado caso
seja maior que o primeiro valor lido ao
quadrado.
 */

import javax.swing.*;

public class C001 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(
                JOptionPane.showInputDialog("Número 1: "));
        int num2 = Integer.parseInt(
                JOptionPane.showInputDialog("Número 2: "));

        int num1Quadrado = num1 * num1;
        int resultado = num1 * num2;
        if (num1Quadrado > resultado){
            JOptionPane.showMessageDialog(null,
                    "Resultado: "+resultado);
        }



    }
}
