package Luno;
import Luno.Coordenada;
import Luno.Rectangulo;

public class Verificador {
    static String verificadorRectangulos(Rectangulo A, Rectangulo B){
        if (A.getEsquina2().getX() < B.getEsquina1().getX() || B.getEsquina2().getX() < A.getEsquina1().getX() 
        || A.getEsquina2().getY() < B.getEsquina1().getY() || B.getEsquina2().getY() < A.getEsquina1().getY()) {
            return "los rectangulos estan disjuntos";
        }

        if ((A.getEsquina2().getX() == B.getEsquina1().getX() || B.getEsquina2().getX() == A.getEsquina1().getX()) 
        || (A.getEsquina2().getY() == B.getEsquina1().getY() || B.getEsquina1().getY() ==  A.getEsquina2().getY())) {
            return "los rectangulos se juntan";
        }

        return "los recatangulos estan sobrepuestos";
    }

    static double calcularAreaInterseccion(Rectangulo A, Rectangulo B) {
        double interseccionX1 = (A.getEsquina1().getX() > B.getEsquina1().getX()) ? A.getEsquina1().getX() : B.getEsquina1().getX();
        double interseccionY1 = (A.getEsquina1().getY() > B.getEsquina1().getY()) ? A.getEsquina1().getY() : B.getEsquina1().getY();
        double interseccionX2 = (A.getEsquina2().getX() < B.getEsquina2().getX()) ? A.getEsquina2().getX() : B.getEsquina2().getX();
        double interseccionY2 = (A.getEsquina2().getY() < B.getEsquina2().getY()) ? A.getEsquina2().getY() : B.getEsquina2().getY();

        System.out.println("Coordenadas de intersección: (" + interseccionX1 + ", " + interseccionY1 + ") a (" + interseccionX2 + ", " + interseccionY2 + ")");
        
        double ancho = interseccionX2 - interseccionX1;
        double alto = interseccionY2 - interseccionY1;

        if (ancho > 0 && alto > 0) {
            return ancho * alto;
        } else {
            System.out.println("No hay intersección válida.");
            return 0;
        }
    }
}
