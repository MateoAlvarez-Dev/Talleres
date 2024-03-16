package _06_Empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    Scanner general_sc = new Scanner(System.in);
    private ArrayList<EmpleadoPermanente> empleadosPermanentes;
    private ArrayList<EmpleadoTemporal> empleadosTemporales;

    public GestionEmpleados(){
        this.empleadosTemporales = new ArrayList<>();
        this.empleadosPermanentes = new ArrayList<>();
    }

    public void crearEmpleado(){
        String nombre;
        int tipoEmpleado;
        int edad;
        int salario;

        System.out.println("Ingrese el nombre del empleado:");
        nombre = general_sc.nextLine();

        System.out.println("""
                Que tipo de empleado es?
                 1) Temporal
                 2) Permanente
                """);
        tipoEmpleado = general_sc.nextInt();

        System.out.println("Ingrese la edad del empleado:");
        edad = general_sc.nextInt();

        System.out.println("Ingrese el salario del empleado:");
        salario = general_sc.nextInt();

        general_sc.nextLine();

        if(tipoEmpleado == 1){
            agregarEmpleado(new EmpleadoTemporal(nombre, edad, salario));
        }else{
            agregarEmpleado(new EmpleadoPermanente(nombre, edad ,salario));
        }
    }

    public void listarEmpleados(){

        System.out.println("ID === NOMBRE === EDAD === SALARIO == TIPO");

        for(EmpleadoTemporal empleadoTemporal : this.empleadosTemporales){
            System.out.println(empleadoTemporal.getIdEmpleado() + " - "
                               + empleadoTemporal.getNombre() + " - "
                               + empleadoTemporal.getEdad() + " - "
                               + "$" + empleadoTemporal.getSalario() + " - Temporal"
            );
        }

        for(EmpleadoPermanente empleadoPermanente : this.empleadosPermanentes){
            System.out.println(empleadoPermanente.getIdEmpleado() + " - "
                               + empleadoPermanente.getNombre() + " - "
                               + empleadoPermanente.getEdad() + " - "
                               + "$" + empleadoPermanente.getSalario() + " - Permanente"
            );
        }
    }

    public void removerEmpleado(){
        int idEmpleado;

        System.out.println("Inserte la ID del empleado que desea remover:");
        idEmpleado = general_sc.nextInt();

        boolean isRemovido1 = this.empleadosPermanentes.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
        boolean isRemovido2 = this.empleadosTemporales.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);

        if(isRemovido1 || isRemovido2){
            System.out.println("Empleado removido con exito.");
        }else{
            System.out.println("Empleado no encontrado.");
        }
    }

    public void agregarEmpleado(EmpleadoTemporal empleado){
        this.empleadosTemporales.add(empleado);
    }

    public void agregarEmpleado(EmpleadoPermanente empleado){
        this.empleadosPermanentes.add(empleado);
    }

}
