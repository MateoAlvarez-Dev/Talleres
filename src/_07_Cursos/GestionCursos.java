package _07_Cursos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionCursos extends AbstractGestionCursos{

    Scanner sc = new Scanner(System.in);
    private ArrayList<Curso> cursos;

    public GestionCursos(){
        this.cursos = new ArrayList<>();
    }

    @Override
    public void agregarCurso() {
        String nombre;
        int codigo;

        System.out.println("Ingrese el nombre del curso:");
        nombre = sc.nextLine();

        System.out.println("Ingrese el codigo del curso:");
        codigo = sc.nextInt();

        sc.nextLine();

        for(Curso curso : cursos){
            if(curso.getCodigoCurso() == codigo){
                System.out.println("Ya existe un curso con ese codigo.");
                return;
            }
        }

        cursos.add(new Curso(codigo, nombre));
    }

    @Override
    public void inscribirEstudiante() {
        int codigo;

        System.out.println("Ingrese el codigo del curso:");
        codigo = sc.nextInt();
        sc.nextLine();

        for(Curso curso : cursos){
            if(curso.getCodigoCurso() == codigo){
                String nombre;
                String email;

                System.out.println("Ingrese el nombre del Estudiante:");
                nombre = sc.nextLine();

                System.out.println("Ingrese el correo del Estudiante:");
                email = sc.nextLine();

                curso.addEstudiante(new Estudiante(nombre, email));
                System.out.println("Estudiante agregado correctamente");
                return;
            }
        }

        System.out.println("No se pudo encontrar un curso con ese codigo");
    }

    @Override
    public void listarEstudiantes() {
        int codigo;

        System.out.println("Ingrese el codigo del curso:");
        codigo = sc.nextInt();
        sc.nextLine();

        for(Curso curso : cursos){
            if(curso.getCodigoCurso() == codigo){
                System.out.println("ID === NOMBRE === EMAIL === CURSO");
                for(Estudiante estudiante : curso.getEstudiantes()){
                    System.out.println(estudiante.getId() + " - "
                            + estudiante.getNombre() + " - "
                            + estudiante.getEmail() + " - "
                            + curso.getNombreCurso()
                    );
                }
                return;
            }
        }

        System.out.println("No se pudo encontrar el curso");
    }

    @Override
    public void listarCursos() {
        System.out.println("CODIGO === NOMBRE === N_ESTUDIANTES");
        for(Curso curso : cursos){
            System.out.println(curso.getCodigoCurso() + " - "
                            + curso.getNombreCurso() + " - "
                            + curso.getEstudiantes().size()
            );
        }
    }
}
