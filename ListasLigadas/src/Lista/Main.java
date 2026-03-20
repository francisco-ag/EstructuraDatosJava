package Lista;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        int opcion = 0 ;

        do{
            String menu = " === MENU LISTA LIGADA === \n"
                    + "1. Insertar\n"
                    + "2. Eliminar\n"
                    + "3. Mostrar\n"
                    + "4. Salir\n"
                    + "Selecciona una opcion";

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );

            switch (opcion){
                case 1:
                    String dato = JOptionPane.showInputDialog(
                            "Ingresa dato a insertar"
                    );
                    lista.insertar(dato);
                    break;
                case 2:
                    String eliminar = JOptionPane.showInputDialog(
                            "Ingresa dato a eliminar"
                    );
                    lista.eliminar(eliminar);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(
                            null,
                            lista.mostrar()
                    );
                    break;
                case 4:
                    JOptionPane.showMessageDialog(
                            null,
                            "Adios"
                    );
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion invalida"
                    );
            }


        }while(opcion != 4);

    }
}