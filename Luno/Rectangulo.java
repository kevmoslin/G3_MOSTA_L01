package Luno;
import java.util.*;
import Luno.Coordenada;

public class Rectangulo{
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
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