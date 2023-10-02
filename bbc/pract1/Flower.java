import java.awt.*;

public class Flower {

    private Color petalColor;
    private Integer anchorX, anchorY;
    private Boolean bendsLeft;
    
    public Flower( Boolean bendsL, Color c ) {
        
        anchorX = 100;
        anchorY = 100;
        petalColor = c;
        bendsLeft = bendsL;
        
    } // end of constructor
    
    public void setAnchorX(int x) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY(int y) {
        anchorY = y;
    } // end of setAnchorY
    
    public void draw( Graphics g ) {

        

        
        // Pot
        Polygon pot = new Polygon();
        pot.addPoint(anchorX+30, anchorY+50);
        pot.addPoint(anchorX+45, anchorY+90);
        pot.addPoint(anchorX+65, anchorY+90);
        pot.addPoint(anchorX+80, anchorY+50);
        g.setColor(Color.ORANGE.darker());
        g.fillPolygon(pot);
        
        // stem
        g.setColor(Color.GREEN.darker());
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.drawLine(anchorX+54, anchorY+15, anchorX+54, anchorY+50);
        
        if (bendsLeft == false) {
            g.drawArc(anchorX+54, anchorY, 30, 30, 180, -90);

            // flower
            g.setColor(petalColor);
            g.fillOval(anchorX+70, anchorY-15, 40, 30);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX+90, anchorY-13, 40, 26);
            Polygon middle = new Polygon();
            middle.addPoint(anchorX+105, anchorY);
            middle.addPoint(anchorX+80, anchorY+10);
            middle.addPoint(anchorX+80, anchorY-10);
            g.setColor(petalColor);
            g.fillPolygon(middle);
        }
        else {
            g.drawArc(anchorX+24, anchorY, 30, 30, 0, 90);

            // flower
            g.setColor(petalColor);
            g.fillOval(anchorX, anchorY-15, 40, 30);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX-20, anchorY-13, 40, 26);
            Polygon middle = new Polygon();
            middle.addPoint(anchorX+5, anchorY);
            middle.addPoint(anchorX+30, anchorY+10);
            middle.addPoint(anchorX+30, anchorY-10);
            g.setColor(petalColor);
            g.fillPolygon(middle);
        }
        
    } // end of draw
    
} // end of class Flower
