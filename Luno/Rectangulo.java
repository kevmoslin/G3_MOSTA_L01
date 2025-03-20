package Luno;
import java.util.*;
import Luno.Coordenada;

public class Rectangulo{
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2){
        setEsquina(c1);
        setEsquina(c2);
    }
    
    Coordenada getEsquina1(){
        return this.esquina1;
    }

    Coordenada getEsquina2(){
        return this.esquina2;
    }

    Coordenada setEsquina1(Coordenada c){
        this.esquina1 = c;
    }

    Coordenada setEsquina2(Coordenada c){
        this.esquina2 = c;
    }

    public String toString(){
        return "Rectangulo: [" + esquina1 + "," + esquina2 + "]";
    }
}