import java.util.*;

public class Coordenada{
    private double x;
    private double y;

    public Coordenada(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Coordenada(Coordenada c){
        this.x = c.x;
        this.y = c.y;
    }

    void setX(double x){
        this.x = x;
    }

    void setY(double y){
        this.y = y;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    double distancia(Coordenada c){

    }

    public static double distancia(Coordenada c1, Coordenada c2){

    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}