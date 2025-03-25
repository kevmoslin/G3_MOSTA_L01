package Luno;
import java.util.ArrayList;

public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0; 

    public ContainerRect(int n){
        this.n = n;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
    }

    private double calcularDistanciaEuclidiana(Rectangulo r){
        return Math.sqrt(Math.pow(r.getEsquina1().getX() - r.getEsquina2().getX(),2) + Math.pow(r.getEsquina1().getY() - r.getEsquina2().getY(),2)); 
    }

    private double calcularArea(Rectangulo r){
        return Math.abs((r.getEsquina2().getX() - r.getEsquina1().getX()) * (r.getEsquina2().getY() - r.getEsquina1().getY()));
    }

    public boolean agregarRectangulo(Rectangulo r){
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = calcularDistanciaEuclidiana(r);
            areas[numRec] = calcularArea(r);
            return true;
        } else {
            System.out.println("no se pueede agregar rectangulos");
            return false;
        }
    }

    private void mostrarRectangulos(){
        for(int i = 0; i < numRec; i++){
            System.out.println("rectangulo " + (i + 1) + ": " + rectangulos[i]);
            System.out.println("distancia Euclidiana " + distancias[i]);
            System.out.println("area " + areas[i]);
        }
    }
}
