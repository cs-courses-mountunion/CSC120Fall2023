import java.awt.*;

public class Duck {

    private Color duckColor;
    private Integer anchorX, anchorY;
    private Boolean facingLeft;
    
    public Duck( Boolean fLeft, Color c ) {
        
        anchorX = 100;
        anchorY = 100;
        duckColor = c;
        facingLeft = fLeft;
        
    } // end of constructor
    
    public void setAnchorX(int x) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY(int y) {
        anchorY = y;
    } // end of setAnchorY
    
    public void draw( Graphics g ) {

        
        
        
        // feet and beak
        g.setColor(Color.ORANGE);
        if (facingLeft == true) {
            g.fillRect(anchorX+100, anchorY+100, 10, 40);
            g.fillRect(anchorX+90, anchorY+130, 20, 10);
            g.fillRect(anchorX+70, anchorY+100, 10, 40);
            g.fillRect(anchorX+60, anchorY+130, 20, 10);
            g.fillRect(anchorX, anchorY+20, 20, 10);
        }
        else {
            g.fillRect(anchorX+30, anchorY+100, 10, 40);
            g.fillRect(anchorX+30, anchorY+130, 20, 10);
            g.fillRect(anchorX+60, anchorY+100, 10, 40);
            g.fillRect(anchorX+60, anchorY+130, 20, 10);
            g.fillRect(anchorX+120, anchorY+20, 20, 10);
        }
        
        // head and body
        g.setColor(duckColor);
        if (facingLeft == true) {
            g.fillRect(anchorX+20, anchorY, 40, 40);
            g.fillRect(anchorX+130, anchorY+30, 10, 50);
            g.fillRect(anchorX+30, anchorY+40, 100, 60);
        }
        else {
            g.fillRect(anchorX+80, anchorY, 40, 40);
            g.fillRect(anchorX, anchorY+30, 10, 50);
            g.fillRect(anchorX+10, anchorY+40, 100, 60);
        }
        
        // wing
        g.setColor(duckColor.darker());
        if (facingLeft == true) {
            g.fillRect(anchorX+65, anchorY+50, 50, 30);
        }
        else {
            g.fillRect(anchorX+25, anchorY+50, 50, 30);
        }
        
        // eye
        g.setColor(Color.BLACK);
        if (facingLeft == true) {
            g.fillRect(anchorX+30, anchorY+10, 10, 10);
        }
        else {
            g.fillRect(anchorX+100, anchorY+10, 10, 10);
        }
        
    } // end of draw
    
} // end of class Duck
