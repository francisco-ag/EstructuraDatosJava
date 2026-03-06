package colas;

import javax.swing.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        int opcion = 0;

        do{
            String menu = " === MENU COLA ===\n"
                    + "1.-  Enqueue / Encolar\n"
                    + "2.-  Dequeue / Desencolar\n"
                    + "3.-  Peek    / Cima\n"
                    + "4.-  Mostrar\n"
                    + "5.-  Salir\n"
                    + "Selecciona una opción";
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            menu
                    )
            );

            switch (opcion){
                case 1:
                    String dato = JOptionPane.showInputDialog(
                            "Ingresa un dato"
                    );
                    cola.add(dato);
                    break;
                case 2:
                    if(!cola.isEmpty()){
                        JOptionPane.showMessageDialog(
                                null,
                                "Dato desencolado "
                                +cola.poll()
                        );
                    }else{
                        JOptionPane.showMessageDialog(
                                null,
                                "La cola esta vacía"
                        );
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    JOptionPane.showMessageDialog(
                            null,
                            "bye "
                    );
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Selecciona opcion valida"
                    );
            }




        }while(opcion != 5);

    }
}