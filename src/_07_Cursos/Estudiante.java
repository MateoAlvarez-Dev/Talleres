package _07_Cursos;

public class Estudiante {

    private static int autoIncrementalId = 1;
    private int id;
    private String nombre;
    private String email;

    public Estudiante(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.id = Estudiante.autoIncrementalId;
        Estudiante.autoIncrementalId += 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
