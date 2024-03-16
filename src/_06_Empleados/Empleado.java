package _06_Empleados;

public class Empleado extends Persona{

    protected static int autoIncrementalId = 1;
    protected int salario;
    protected int idEmpleado;

    public Empleado(String nombre, int edad, int salario){
        super(nombre, edad);
        this.salario = salario;
        this.idEmpleado = autoIncrementalId;
        Empleado.autoIncrementalId++;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                ", idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
