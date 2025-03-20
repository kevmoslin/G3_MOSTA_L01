package Luno;
import java.util.*;
import Luno.Coordenada;

public class Rectangulo{
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
        double minX, minY, maxX, maxY;

        if (c1.getX() < c2.getX()) {
            minX = c1.getX();
            maxX = c2.getX();
        } else{
            minX = c2.getX();
            maxX = c1.getX();
        }

        if (c1.getY() < c2.getY()) {
            minY = c1.getY();
            maxX = c2.getY();
        } else{
            minY = c2.getY();
            maxX = c1.getY();
        }
        
        this.esquina1 = c1;
        this.esquina2 = c2;
    }
    
    Coordenada getEsquina1(){
        return this.esquina1;
    }

    Coordenada getEsquina2(){
        return this.esquina2;
    }

    void setEsquina1(Coordenada c){
        this.esquina1 = c;
    }

    void setEsquina2(Coordenada c){
        this.esquina2 = c;
    }

    public String toString(){
        return "Rectangulo: [" + esquina1 + "," + esquina2 + "]";
    }
}