package _06_Empleados;

import java.util.Scanner;

public class EmpleadoMenu {

    GestionEmpleados gestor = new GestionEmpleados();
    Scanner sc = new Scanner(System.in);

    public void start(){
        while(true){
            int option;

            System.out.println("Bienvenid@ a la gestion de empleados");
            System.out.println("Que desea hacer hoy?");
            System.out.println("1) Agregar Empleado");
            System.out.println("2) Listar Empleados");
            System.out.println("3) Eliminar Empleado");
            System.out.println("4) Salir");

            try{
                option = sc.nextInt();
                sc.nextLine();

                switch (option){
                    case 1:
                        gestor.crearEmpleado();
                        break;
                    case 2:
                        gestor.listarEmpleados();
                        break;
                    case 3:
                        gestor.removerEmpleado();
                        break;
                    case 4:
                        return;
                }
            }catch (Exception e){
                System.out.println("Ocurrió un error, saliendo...");
                break;
            }
        }
    }

}
