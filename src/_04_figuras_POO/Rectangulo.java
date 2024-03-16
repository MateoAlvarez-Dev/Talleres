package _04_figuras_POO;

public class Rectangulo extends Figura{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }
}
