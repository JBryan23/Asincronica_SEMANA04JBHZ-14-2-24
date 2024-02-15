/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista

/**
 *
 * @author Usuario
 */
public class Ejercicio1_JosueBryanHernandezZelaya {

    /**
     * Ejercicio1: . Escribir un programa que permita al usuario ingresar una un año desde el teclado y éste
evalúe si es un año bisiesto, un año es bisiesto si este es divisible entre 4 y no divisible
entre 100, y también si es divisible entre 400. Por ejemplo, 1988, 1992 y 1996 son años
bisiestos
* 
* Nota: Programar con la sintaxis básica del lenguaje de programación Java, utilizando las
estructuras de control (if, if-else, else, switch), estructuras de repetición (for, while, do
while), vistos en clase, para cada caso específico.
     */
    public static void main(String[] args) {
        String años_considerar = JOptionPane.showInputDialog("Ingrese el año: ");
        int año = Integer.parseInt(años_considerar);
        boolean año_bisiesto = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));

        String resultado;
        if (año_bisiesto) {
            resultado = "El año que ingreso -" + año + "- es bisiesto.";
        } else {
            resultado = "El año que ingreso -" + año + "- no es bisiesto.";
        }

        JOptionPane.showMessageDialog(null, resultado);
        
    }
    
}
//Josue Bryan Hernandez Zelaya
