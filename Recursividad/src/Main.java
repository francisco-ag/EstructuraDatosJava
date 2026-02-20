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
                   int numFib = Integer.parseInt(
                           JOptionPane.showInputDialog(
                                   "¿Cuantos numeros quieres de la serie?"
                           )
                   );

                   StringBuilder sb = new StringBuilder(
                           "Sucesión Fibonacci\n"
                   );

                   for (int i=0 ; i < numFib ; i++ ){
                       sb.append( fibonacci(i) ).append("->");
                   }

                   JOptionPane.showMessageDialog(
                           null,
                           sb.toString()
                   );

                   break;
               case 3:
                   int n = Integer.parseInt(
                           JOptionPane.showInputDialog("¿Cuantos elementos quieres guardar?")
                   );
                   int[] vector = new int[n];
                   for ( int i=0; i<n ; i++){
                       vector[i] = Integer.parseInt(
                               JOptionPane.showInputDialog( "Elemento "+(i+1)+" : ")
                       );
                   }
                   int suma = sumaVectorRecursiva(vector,0);
                   JOptionPane.showMessageDialog(
                           null,
                           "La suma del vector es "+suma
                   );
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

    public static int sumaVectorRecursiva (
            int[] vector,
            int indice
    ){
        if( indice == vector.length ) return  0;
        return  vector[indice] + sumaVectorRecursiva(vector,indice+1);
    }

    public static int fibonacci ( int numero){
        if ( numero == 0 ) return  0;
        if ( numero == 1 ) return  1;
        return fibonacci( numero - 1)
                + fibonacci( numero - 2) ;
    }



}