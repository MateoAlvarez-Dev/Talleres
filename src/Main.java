import  static libs.Calculator.*;
import javax.swing.JOptionPane;

/*
*
*  == ATENCION ==
*  Este main no tiene nada de importante mas que un ejercicio que quise hacer por cuenta propia
*  para ver las soluciones de los puntos entra a cada modulo y ejecuta el main de cada uno. gracias :)
*
* */

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.start();
    }
}

class Program{
    public void start() {
        String operation;

        while(true){
            try{
                operation = JOptionPane.showInputDialog("Introduzca la operacion");

                JOptionPane.showMessageDialog(null, calc(operation));
            }catch (Exception exp){
                System.out.println("Gracias por usar");
                break;
            }
        }
    }
}
