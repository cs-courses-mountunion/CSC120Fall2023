import java.awt.*;

public class Rocket {

    private Color noseColor;
    private Integer anchorX, anchorY;
    private Boolean facingLeft;
    
    public Rocket( Color c, Boolean fLeft ) {
        
        anchorX = 100;
        anchorY = 100;
        noseColor = c;
        facingLeft = fLeft;
        
    } // end of constructor
    
    public void setAnchorX(int x) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY(int y) {
        anchorY = y;
    } // end of setAnchorY
    
    public void draw( Graphics g ) {


        
        
        g.setColor(noseColor);
        if (facingLeft == true) {
            g.fillOval(anchorX, anchorY, 80, 30);
            g.fillOval(anchorX+65, anchorY, 50, 30);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX+75, anchorY+3, 40, 24);
            g.setColor(Color.LIGHT_GRAY);
            g.fillArc(anchorX, anchorY, 80, 30, 270, 180);
            g.setColor(Color.WHITE);
            g.fillRect(anchorX+20, anchorY, 35, 30);
            g.fillRect(anchorX+85, anchorY+10, 45, 10);
            g.setColor(noseColor);
            g.fillOval(anchorX+70, anchorY+13, 25, 5);
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval(anchorX+25, anchorY+7, 16, 16);
            Color window = new Color(255-noseColor.getRed(), 255-noseColor.getGreen(), 255-noseColor.getBlue());
            g.setColor(window);
            g.fillOval(anchorX+26, anchorY+8, 14, 14);
            g.setColor(Color.BLACK);
            g.drawOval(anchorX, anchorY, 80, 30);
            g.drawLine(anchorX+55, anchorY+2, anchorX+55, anchorY+28);
            g.drawLine(anchorX+20, anchorY+2, anchorX+20, anchorY+28);
        }
        else {
            g.fillOval(anchorX+30, anchorY, 80, 30);
            g.fillOval(anchorX-5, anchorY, 50, 30);
            g.setColor(Color.WHITE);
            g.fillOval(anchorX-5, anchorY+3, 40, 24);
            g.setColor(Color.LIGHT_GRAY);
            g.fillArc(anchorX+30, anchorY, 80, 30, 90, 180);
            g.setColor(Color.WHITE);
            g.fillRect(anchorX+55, anchorY, 35, 30);
            g.fillRect(anchorX-15, anchorY+10, 45, 10);
            g.setColor(noseColor);
            g.fillOval(anchorX+15, anchorY+13, 25, 5);
            g.setColor(Color.LIGHT_GRAY);
            g.fillOval(anchorX+69, anchorY+7, 16, 16);
            Color window = new Color(255-noseColor.getRed(), 255-noseColor.getGreen(), 255-noseColor.getBlue());
            g.setColor(window);
            g.fillOval(anchorX+70, anchorY+8, 14, 14);
            g.setColor(Color.BLACK);
            g.drawOval(anchorX+30, anchorY, 80, 30);
            g.drawLine(anchorX+55, anchorY+2, anchorX+55, anchorY+28);
            g.drawLine(anchorX+90, anchorY+2, anchorX+90, anchorY+28);
        }
        
        
    } // end of draw
    
} // end of class Rocket
