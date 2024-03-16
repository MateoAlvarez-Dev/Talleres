package _07_Cursos;

import java.util.Scanner;

public class MenuCursos {
    private GestionCursos gestor;
    private Scanner sc = new Scanner(System.in);

    public MenuCursos(){
        gestor = new GestionCursos();
    }

    public void start(){
        while(true){
            int option;

            System.out.println("Bienvenid@ a la gestion de cursos");
            System.out.println("Que desea hacer hoy?");
            System.out.println("1) Agregar curso");
            System.out.println("2) Agregar estudiantes");
            System.out.println("3) Listar Estudiantes");
            System.out.println("4) Listar Cursos");
            System.out.println("5) Salir");

            try{
                option = sc.nextInt();
                sc.nextLine();

                switch (option){
                    case 1:
                        gestor.agregarCurso();
                        break;
                    case 2:
                        gestor.inscribirEstudiante();
                        break;
                    case 3:
                        gestor.listarEstudiantes();
                        break;
                    case 4:
                        gestor.listarCursos();
                        break;
                    case 5:
                        return;
                }
            }catch (Exception e){
                System.out.println("Ocurrió un error, saliendo...");
                break;
            }
        }
    }
}
