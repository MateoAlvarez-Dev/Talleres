package _07_Cursos;

import java.util.ArrayList;

public class Curso {

    private int codigoCurso;
    private String nombreCurso;
    private ArrayList<Estudiante> estudiantes;

    public Curso(int codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.estudiantes = new ArrayList<>();
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }
}
