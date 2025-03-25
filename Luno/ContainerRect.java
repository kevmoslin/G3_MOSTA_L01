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

    public boolean addRectangulo(Rectangulo r){
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = calcularDistanciaEuclidiana(r);
            areas[numRec] = calcularArea(r);
            numRec++;
            return true;
        } else {
            System.out.println("no se pueede agregar rectangulos");
            return false;
        }
    }

    @Override
    private String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("rectangulo coordenadas distancia area \n");
        for(int i = 0; i < numRec; i++){
            sb.append((i + 1) + " (" + rectangulos[i].getEsquina1() + ", " + rectangulos[i].getEsquina2() + ") ");
            sb.append(String.format("%.3f", distancias[i]) + " ");
            sb.append(String.format("%.2f", areas[i]) + "\n");
        }
        return sb.toString();
    }
}
