package Matriz;

import java.util.Scanner;

public class Main {

    // metodo Main
    public static void main (String[] a){
        Scanner sc = new Scanner(System.in);

        // 2 filas x 3 columnas
        String[][] matriz = new String[2][2];

        for (int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Ingresa  el nombre en la posicion ["+i+"]["+j+"] : ");
                matriz[i][j] = sc.next();
            }
        }

        System.out.println("Matriz ingresada :");
        for (int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Ingresa filas y columnas de la Matriz");
        int filas = sc.nextInt();
        int columnas = sc.nextInt();

        creaMatrizFilasxColumna(filas, columnas);

    }

    public static void creaMatrizFilasxColumna(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];
        Scanner scanner2 = new Scanner(System.in);
        int suma = 0;
        for(int i=0; i< matriz.length ; i++){
            for(int j=0; j<columnas; j++){
                matriz[i][j] = scanner2.nextInt();
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de la matriz es: "+suma);

    }

}
