package Luno;
import Luno.Coordenada;
import Luno.Rectangulo;

public class Verificador {
    static String verificadorRectangulos(Rectangulo A, Rectangulo B){
        if (A.getEsquina2().getX() < B.getEsquina1().getX() || B.getEsquina2().getX() < A.getEsquina1().getX() || A.getEsquina2().getY() < B.getEsquina1().getY() || B.getEsquina2().getY() < A.getEsquina1().getY()) {
            return "los rectangulos estan disjuntos";
        }

        if ((A.getEsquina2().getX() == B.getEsquina1().getX() || B.getEsquina2().getX() == A.getEsquina1().getX()) || (A.getEsquina2().getY() == B.getEsquina1().getY() || B.getEsquina1().getY() ==  A.getEsquina2().getY())) {
            return "los rectangulos se juntan";
        }

        return "los recatangulos estan sobrepuestos";
    }
}
