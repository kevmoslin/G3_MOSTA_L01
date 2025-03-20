package Luno;
import java.util.Scanner;
import Luno.Coordenada;
import Luno.Rectangulo;

public class Principal{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese una esquina del primer recatangulo: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("ingrese la otra esquina del primer recatangulo: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        System.out.println("ingrese una esquina del segundo rectangulo: ");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();

        System.out.println("ingrese otra esquina del segundo rectangulo: ");
        double x4 = scan.nextDouble();
        double y4 = scan.nextDouble();
        
        Rectangulo A = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
        Rectangulo B = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));

        System.out.println(A);
        System.out.println(B);

        System.out.println(Verificador.verificadorRectangulos(A, B));
    }
}