package _05_inventario;

import java.util.Objects;
import java.util.Scanner;

public class InventarioController {
    private final Inventario my_storage = new Inventario();
    String option;

    public void init(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenid@ al sistema de inventario RIWI");
            System.out.println("Que desea hacer?");
            System.out.println("1) Agregar" +
                    "\n2) Listar" +
                    "\n3) Eliminar" +
                    "\n4) Filtrar" +
                    "\n5) Salir\n");

            option = scanner.nextLine();

            if(Objects.equals(option, "1")){
                add(scanner);
            }else if(Objects.equals(option, "2")){
                list();
            } else if(Objects.equals(option, "3")){
                remove(scanner);
            }else if(Objects.equals(option, "4")){
                filter(scanner);
            }else if (Objects.equals(option, "5")) {
                scanner.close();
                return;
            }

            this.init();
        }catch (Exception e){
            System.out.println("Un error ha ocurrido...");
            this.init();
        }
    }

    private void add(Scanner scanner){

        System.out.println("\n======== [AGREGANDO] ========");

        System.out.println("\nInserte nombre del producto:");
        String name = scanner.nextLine();

        System.out.println("\nInserte precio del producto:");
        int price = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\nInserte la categoria del producto:");
        String category = scanner.nextLine();

        System.out.println("\nInserte la marca del producto:");
        String brand = scanner.nextLine();

        ProductoEspecifico finalProduct = new ProductoEspecifico(name, price, category, brand);
        my_storage.agregarProductos(finalProduct);

        System.out.println("\n\nProducto agregado. Regresando...\n");
    }

    private void remove(Scanner scanner){

        System.out.println("\nInserte la ID del producto a eliminar");
        int id = scanner.nextInt();

        boolean isDeleted = my_storage.eliminarProducto(id);

        if(isDeleted){
            System.out.println("\n\nProducto eliminado. Retornando...\n\n");
        }else{
            System.out.println("\n\nProducto no encontrado. Retornando...\n\n");
        }
    }

    private void list(){
        System.out.println("\n======[CARRITO]=======");
        System.out.println("ID"
                + " - Nombre"
                + " - Precio"
                + " - Categoria"
                + " - Marca\n");
        my_storage.listarProductos();
        System.out.println("\n======================\n");
    }

    private void filter(Scanner scanner){
        System.out.println("\n======== [FILTRADO] ========");

        System.out.println("\nComo quieres filtrar?");
        System.out.println("1) Por nombre");
        System.out.println("2) Por precio");
        System.out.println("3) Por categoria");

        String option = scanner.nextLine();

        switch (option){
            case "1":
                System.out.println("\nIngresa el nombre del producto");
                String name = scanner.nextLine();
                my_storage.filtrarProductos(name);
                break;
            case "2":
                System.out.println("\nIngresa el precio del producto");
                double price = scanner.nextDouble();
                my_storage.filtrarProductos(price);
                break;
            case "3":
                System.out.println("\nIngresa la categoria del producto");
                String category = scanner.nextLine();
                my_storage.filtrarProductos(null, category);
                break;
        }

        System.out.println("\n===========================");
    }
}
