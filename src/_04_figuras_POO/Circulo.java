package _04_figuras_POO;
import java.lang.Math;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.pow(radio * Math.PI, 2);
    }
}
