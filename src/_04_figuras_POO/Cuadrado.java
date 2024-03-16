package _04_figuras_POO;

public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado){
        super(lado, lado);
    }

    // No es necesario sobreescribir calcularArea(); porque al implementar
    // de rectangulo ya estamos obteniendo la funcionalidad
}
