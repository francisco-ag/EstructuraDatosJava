import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion=0;

        do{
           String menu = " === Menu de Recursividad === \n"
                   + "1. Calcular Factorial\n"
                   + "2. Calcular Fibonacci\n"
                   + "3. Suma Elementos Vector Recursivo\n"
                   + "4. Invertida cadena\n"
                   + "9. Salir\n"
                   + "Selecciona una opción\n";
           opcion = Integer.parseInt(
                   JOptionPane.showInputDialog( menu )
           );

           switch (opcion){
               case 1:
                   int numFactorial = Integer.parseInt(
                           JOptionPane.showInputDialog(
                                   "Ingrese un número:"
                           )
                   );
                   int resultado = factorial( numFactorial );
                   JOptionPane.showMessageDialog(
                           null,
                           "Factorial de " +numFactorial+" = "+resultado
                   );
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   String texto = JOptionPane.showInputDialog(
                           "Ingresa una palabra: "
                   );
                   String texto_invertido = invertir(texto) ;
                   JOptionPane.showMessageDialog(
                           null,
                           "la palabra invertidas es "+texto_invertido
                   );
                   break;
           }

        }while(opcion != 9);


    }

    public static int factorial(int n){
        if( n == 0 || n == 1 ) return 1 ;
        return n * factorial( n-1 );
    }

    public static String invertir(String texto){
        if ( texto.length() <= 1 ) return texto ;
        return invertir( texto.substring(1) )
                + texto.charAt(0);
    }
}