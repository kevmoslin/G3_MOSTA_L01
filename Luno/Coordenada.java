package Luno;

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
        double dx = this.x - c.getX();
        double dy = this.y - c.getY();
        return sqrtAproximado(dx * dx + dy * dy);
    }

    public static double distancia(Coordenada c1, Coordenada c2){
        double dx = c1.getX() - c2.getX();
        double dy = c1.getY() - c2.getY();
        return sqrtAproximado(dx * dx + dy * dy);
    }

    private static double sqrtAproximado(double num){
        double x = num /2;
        for (int i = 0; i < 10; i++){
            x = (x + num / x ) / 2;
        }
        return x;

    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}