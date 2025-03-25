package Luno;
import java.util.*;
import Luno.Coordenada;
import Luno.Rectangulo;

public class Principal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número máximo de rectángulos a almacenar: ");
        int maxRect = scanner.nextInt();
        
        ContainerRect contenedor = new ContainerRect(maxRect);
        
        while (true) {
            System.out.print("Ingrese coordenadas x1 y1 x2 y2 (o -1 para salir): ");
            double x1 = scanner.nextDouble();
            if (x1 == -1) break;
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            
            Rectangulo rect = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
            contenedor.addRectangulo(rect);
        }
        
        System.out.println(contenedor);
        scanner.close();
    }
}
