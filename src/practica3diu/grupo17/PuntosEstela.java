
package practica3diu.grupo17;


import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class PuntosEstela {
    
    ArrayList<Point> puntos;

    public PuntosEstela() {
        puntos = new ArrayList<>();
    }

    public ArrayList<Point> getPuntos() {
        return puntos;
    }
    
    public void addPunto( Point a){
        puntos.add(a);
    }

    public void removePunto (){
        puntos.remove(0);
    }
    
    public void removeAll(){
        puntos.clear();
    }
    
    public int size(){
        return puntos.size();
    }
    
    public void print(Graphics a, String t){
        for (Point punto : puntos) {
            int X = (int) punto.getX();
            int Y = (int) punto.getY();
            switch(t){
                    case "Ovalo":    
                    a.drawOval(X,Y, 15, 10);
                    break;
                    case "Circulo":
                    a.fillOval(X, Y, 10, 10);
                    break;
                    case "Cuadrado":
                    a.fillRect(X, Y, 10, 10);
                    break;
            }
        }
        
    }           
}
