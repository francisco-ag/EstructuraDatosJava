package arbol;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Arbol myArbol = new Arbol();

        int opcion=0;

        do{
            String menu = " === MENU ARBOLES ===\n"
                    +"( 1 ) Insertar \n"
                    +"( 2 ) Buscar \n"
                    +"( 3 ) Recorrido inOrden \n"
                    +"( 9 ) Salir \n"
                    +"Selecciona una opción";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion){
                case 1:
                    int valor = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingresa un numero"
                            )
                    );
                    myArbol.insertar(valor);
                    break;
                case 2:
                    int valorBuscar = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Ingresa un numero a Buscar"
                            )
                    );
                    boolean encontrado = myArbol.buscar(valorBuscar);
                    JOptionPane.showMessageDialog(
                            null,
                            encontrado ? "Numero encontrado" : "No encontrado"
                    );
                    break;
                case 3:
                    JOptionPane.showMessageDialog(
                            null,
                            "Recorrido inOrden"+myArbol.inOrden()
                    );

            }


        }while(opcion != 9);

    }
}