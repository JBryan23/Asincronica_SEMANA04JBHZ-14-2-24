/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista


/**
 *
 * @author Usuario
 */
public class Ejercicio2_JosueBryanHernandezZelaya {

    /**
     * . Escriba un programa que permita ingresar números del teclado y calcular si es un
número par, o impar hasta que el número ingresado sea menor o igual que 50.

* Nota: Programar con la sintaxis básica del lenguaje de programación Java, utilizando las
estructuras de control (if, if-else, else, switch), estructuras de repetición (for, while, do
while), vistos en clase, para cada caso específico.
     */
    public static void main(String[] args) {
        String numero_principal;
        int numero_ingresado;

        do {
            numero_principal = JOptionPane.showInputDialog("Ingrese un número: ");
            numero_ingresado = Integer.parseInt(numero_principal);

            if (numero_ingresado <= 50) {
                if (numero_ingresado % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El número ingresado es par. (" + numero_ingresado+")");
                } else {
                    JOptionPane.showMessageDialog(null, "El número ingresado es impar. (" + numero_ingresado+")");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Advertencia, el numero ingresado debe ser menor o igual que 50.");
            }
        } while (numero_ingresado > 50);
    }
    
}
//Josue Bryan Hernandez Zelaya
