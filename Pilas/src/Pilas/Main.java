package Pilas;

import javax.swing.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String>  pila = new Stack<>();

        int opcion = 0;
        do{
            String menu = "=== MENU PILA ===\n"
                    +"( 1 ) Push / Agregar \n"
                    +"( 2 ) Pop / Sacar \n"
                    +"( 3 ) Peek / Ver cima \n"
                    +"( 4 ) Mostrar Pila \n "
                    +"( 5 ) Salir \n"
                    +"Selecciona una opción ";
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );

            switch (opcion){
                case 1:
                    String dato = JOptionPane.showInputDialog(
                            "Ingresa un elemento :"
                    );
                    pila.push(dato);
                    break;
                case 2:
                    if(!pila.isEmpty())
                    {
                        JOptionPane.showMessageDialog(
                                null,
                                "Elemento sacado " +pila.pop()
                        );
                    }else{
                        JOptionPane.showMessageDialog(
                                null,
                                "La pila esta vacía"
                        );
                    }

                    break;
                case 3:
                    if(!pila.isEmpty())
                    {
                        JOptionPane.showMessageDialog(
                                null,
                                "Elemento en la cima " +pila.peek()
                        );
                    }else{
                        JOptionPane.showMessageDialog(
                                null,
                                "La pila esta vacía"
                        );
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(
                            null,
                            "Pila : "+pila
                    );
                    break;
                case 5:
                    JOptionPane.showMessageDialog(
                            null,
                            "Adios :) "
                    );
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion Invalida"
                    );
            }
        }while(opcion != 5);
    }
}