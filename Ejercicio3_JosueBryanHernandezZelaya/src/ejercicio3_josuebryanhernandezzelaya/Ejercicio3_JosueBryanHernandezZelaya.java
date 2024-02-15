/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista

/**
 *
 * @author Usuario
 */
public class Ejercicio3_JosueBryanHernandezZelaya {

    /**
     * . Escribir un programa que simule una calculadora, dependiendo de la opción ingresada
(1- suma, 2- resta, 3- multiplicación, 4- división) por el usuario, realice la operación
solicitada. Para la división se debe restringir que el divisor sea distinto de cero.
* 
* Nota: Programar con la sintaxis básica del lenguaje de programación Java, utilizando las
estructuras de control (if, if-else, else, switch), estructuras de repetición (for, while, do
while), vistos en clase, para cada caso específico.
     */
    public static void main(String[] args) {
        
        String opciones, numero_principal, numero_secundario;
        double opcion, numUno, numDos;
        boolean salir = false;

        while (!salir) {
            try {
                opciones = JOptionPane.showInputDialog("Eliga lo que quiere realizar: \n1-Suma \n2-Resta \n3-Multiplicación \n4-División \n5-Salir ");
                opcion = Double.parseDouble(opciones);

                switch ((int) opcion) {
                    case 1:
                        try {
                            numero_principal = JOptionPane.showInputDialog("Ingrese el primer número: ");
                            numUno = Double.parseDouble(numero_principal);

                            numero_secundario = JOptionPane.showInputDialog("Ingrese el segundo número: ");
                            numDos = Double.parseDouble(numero_secundario);

                            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " 
                                    + String.format("%.2f", numUno + numDos)); //Concatenar usando otro formato y realizando la operacions
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion, numero ingresado incorrecto");
                        }
                        break;
                    case 2:
                        try {
                            numero_principal = JOptionPane.showInputDialog("Ingrese el primer número: ");
                            numUno = Double.parseDouble(numero_principal);

                            numero_secundario = JOptionPane.showInputDialog("Ingrese el segundo número: ");
                            numDos = Double.parseDouble(numero_secundario);

                            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " 
                                    + String.format("%.2f", numUno - numDos));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion, numero ingresado incorrecto");
                        }
                        break;
                    case 3:
                        try {
                            numero_principal = JOptionPane.showInputDialog("Ingrese el primer número: ");
                            numUno = Double.parseDouble(numero_principal);

                            numero_secundario = JOptionPane.showInputDialog("Ingrese el segundo número: ");
                            numDos = Double.parseDouble(numero_secundario);

                            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " 
                                    + String.format("%.2f", numUno * numDos));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion, numero ingresado incorrecto");
                        }
                        break;
                    case 4:
                        try {
                            numero_principal = JOptionPane.showInputDialog("Ingrese el primer número: ");
                            numUno = Double.parseDouble(numero_principal);

                            numero_secundario = JOptionPane.showInputDialog("Ingrese el segundo número: ");
                            numDos = Double.parseDouble(numero_secundario);

                            if (numDos != 0) {
                                JOptionPane.showMessageDialog(null, "El resultado de la división es: " 
                                        + String.format("%.2f", numUno / numDos));
                            } else {
                                JOptionPane.showMessageDialog(null, "Advertencia: no es posible que el divisor no puede ser 0.");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No se puede realizar la operacion, numero ingresado incorrecto");
                        }
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No se puede realizar la operacion, numero ingresado incorrecto");
            }

        }
    }
    
}
//Josue Bryan Hernandez Zelaya
