package Luno;
import Luno.Coordenada;
import Luno.Rectangulo;

public class Principal{
    public static void main(String[] args){
        Rectangulo A = new Rectangulo(new Coordenada(1.5, 0.3), new Coordenada(7.6, 2.2));
        Rectangulo B = new Rectangulo(new Coordenada(4.0, 4.2), new Coordenada(9.4, -2.5));

        System.out.println(A);
        System.out.println(B);

        System.out.println(Verificador.verificadorRectangulos(A, B));
    }
}