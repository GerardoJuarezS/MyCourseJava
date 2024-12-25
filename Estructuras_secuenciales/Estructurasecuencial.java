package Estructuras_secuenciales;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estructurasecuencial {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        Scanner sc = new Scanner(System.in);
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma de los dos numeros es: " + suma);
                
    }
}