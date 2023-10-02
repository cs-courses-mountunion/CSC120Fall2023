import java.awt.*;

public class AngelFish {

    private Color bodyColor;
    private Integer anchorX, anchorY;
    private Boolean facingRight;
    
    public AngelFish( Boolean fr, Color c ) {
        
        anchorX = 50;
        anchorY = 50;
        bodyColor = c;
        facingRight = fr;
        
    } // end of constructor
    
    public void setAnchorX(int x) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY(int y) {
        anchorY = y;
    } // end of setAnchorY
    
    public void draw( Graphics g ) {



        
        g.setColor(bodyColor);
        if (facingRight == true) {
            g.fillOval(anchorX, anchorY-20, 120, 105);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX-10, anchorY-10, 130, 85);
            g.setColor(bodyColor);
            g.fillOval(anchorX+40, anchorY, 100, 75);
            g.fillOval(anchorX, anchorY+12, 60, 50);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX-20, anchorY+20, 60, 35);
            g.fillOval(anchorX+110, anchorY+25, 15, 15);
            g.drawArc(anchorX+98, anchorY+25, 35, 30, -60, -100);
            g.setColor(Color.BLACK);
            g.fillOval(anchorX+114, anchorY+29, 7, 7);
        }
        else {
            g.fillOval(anchorX+20, anchorY-20, 120, 105);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX+30, anchorY-10, 130, 85);
            g.setColor(bodyColor);
            g.fillOval(anchorX, anchorY, 100, 75);
            g.fillOval(anchorX+90, anchorY+12, 60, 50);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX+110, anchorY+20, 60, 35);
            g.fillOval(anchorX+15, anchorY+25, 15, 15);
            g.drawArc(anchorX+13, anchorY+25, 35, 30, 240, 100);
            g.setColor(Color.BLACK);
            g.fillOval(anchorX+19, anchorY+29, 7, 7);
        }
        
        
    } // end of draw
    
} // end of class AngelFish
