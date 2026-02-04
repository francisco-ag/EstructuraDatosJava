package Actividad;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    //        System.out.print("Hola Mundo");
//
//        Alumno francisco = new Alumno();
//        Alumno axel = new Alumno();
//
//        int[] vector = new int[5];
//
//        for(int i=1; i<=vector.length; i++ ){
//            System.out.println("Estoy en el vector");
//            System.out.println("Posicion "+i);
//        }
    public static void main(String[] args) {

        int n;
        do {
            System.out.println("Presiona 9 para salir");
            System.out.println("Selecciona una opción");
            System.out.println("( 1 )  Crea un vector de numeros");
            System.out.println("( 2 )  Crea un vector de strings");
            System.out.println("( 3 )  Vector +1");
            System.out.println("( 5 )  Sumar elementos vector");
            System.out.println("( 6 )  Pares e impares vector");

            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1\n");
                    crearVectorInt();
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2\n");
                    crearVectorString();
                    break;
                case 3:
                    System.out.println("Seleccionaste la opcion 3\n");
                    crearVectorMasUno();
                    break;
                case 4:
                    System.out.println("Seleccionaste la opcion 4\n");
                    break;
                case 5:
                    System.out.println("==== SUMA DE ELEMENTOS ====");
                    System.out.println("¿Cuántos números quieres sumar?");
                    int size = sc.nextInt();
                    sumaElementosVector(size);
                    break;
                case 6:
                    System.out.println("==== PARES E IMPARES ====");
                    System.out.println("¿Cuántos números quieres sumar?");
                    int numeros = sc.nextInt();
                    paresImpares(numeros);
                    break;
            }

        } while (n != 4);
    }

    public static void paresImpares(int numeros){
        int[] vector = new int[numeros];
        int pares = 0;
        int impares = 0;

        for(int i=0; i<=vector.length-1;i++){
            System.out.println("Ingresa el no. "+(i+1));
            vector[i] = sc.nextInt();

            if(vector[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }

        }

        System.out.println("Pares : "+pares);
        System.out.println("Impares : "+impares);


    }


    public static void sumaElementosVector(int size) {
        int[] vector = new int[size];
        for (int i = 0; i <= vector.length; i++) {
            System.out.println("Ingresa no. " + (i + 1));
            vector[i] = sc.nextInt();
        }

        int suma = 0;
        for (int numero : vector) {
            suma += numero;
        }
        System.out.println("Tus numeros fueron");
        System.out.println(Arrays.toString(vector));
        System.out.println("La suma de tus numero fue: " + suma);
    }

    public static void crearVectorInt() {
        int[] vector = new int[5];
        System.out.println(Arrays.toString(vector));
        for (int i = 0; i <= vector.length - 1; i++) {
            System.out.println("Ingresa el No. de la posicion " + i);
            vector[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(vector));
    }

    public static void crearVectorMasUno() {
        int[] vector = new int[5];
        int[] vectorCopia = new int[5];
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vectorCopia));
        for (int i = 0; i <= vector.length - 1; i++) {
            System.out.println("Ingresa el No. de la posicion " + i);
            vector[i] = sc.nextInt();
            vectorCopia[i] = vector[i] + 1;
        }
        System.out.println("Vector Original:");
        System.out.println(Arrays.toString(vector));
        System.out.println("Vector +1:");
        System.out.println(Arrays.toString(vectorCopia));
    }

    public static void crearVectorString() {
        String[] nombres = new String[5];
        System.out.println(Arrays.toString(nombres));
        for (int i = 0; i <= nombres.length - 1; i++) {
            System.out.println("Ingresa el Nombre no." + (i + 1));
            nombres[i] = sc.next();
        }
        System.out.println(Arrays.toString(nombres));
    }

    // Otra función
    public static void otraFuncion() {


        // Modificacion de valores
//        vector[0] = 5000;
//        nombres[vector.length - 1] = "X";
//        System.out.println("Vector Numeros");
//        System.out.println(Arrays.toString(vector));
//        System.out.println("Vector Nombres");
//        System.out.println(Arrays.toString(nombres));

    }
}
