package _04_figuras_POO;

public class Main {
    public static void main(String args[]){
        Cuadrado cuadrado = new Cuadrado(40);
        Rectangulo rectangulo = new Rectangulo(20, 40);
        Circulo circulo = new Circulo(18);

        System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El area del circulo es: " + circulo.calcularArea());
    }
}
