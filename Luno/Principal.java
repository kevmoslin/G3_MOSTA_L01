package Luno;
import java.util.*;
import Luno.Coordenada;
import Luno.Rectangulo;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0, x4 = 0, y4 = 0;

        System.out.println("ingrese una esquina del primer recatangulo: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("ingrese la otra esquina del primer recatangulo: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        System.out.println("ingrese una esquina del segundo rectangulo: ");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        System.out.println("ingrese otra esquina del segundo rectangulo: ");
        x4 = scanner.nextDouble();
        y4 = scanner.nextDouble();
        
        Rectangulo A = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
        Rectangulo B = new Rectangulo(new Coordenada(x3, y3), new Coordenada(x4, y4));

        System.out.println(A);
        System.out.println(B);
        String resultado = Verificador.verificadorRectangulos(A, B);

        if (resultado.equals("los recatangulos estan sobrepuestos")) {
            double areaInterseccion = Verificador.calcularAreaInterseccion(A, B);
            System.out.println("area de interseccion: " + areaInterseccion);
        }

        System.out.println(resultado);

        scanner.close();
    }
}
