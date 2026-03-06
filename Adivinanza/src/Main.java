
import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numero = random.nextInt(10);
        System.out.println(numero);
        adivinanza(numero);
    }

    public static void adivinanza (int random){
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if ( intento == random){
            JOptionPane.showMessageDialog(null, "Adivinaste :)");
        }else {
            JOptionPane.showMessageDialog(null,"NO adivinaste");
            adivinanza(random);
        }
    }


}