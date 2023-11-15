import java.awt.*;

public class Piggie {
    
    private Integer anchorX, anchorY, size;
    
    
    // constructor
    public Piggie( Integer s ) {
        java.util.Random gen = new java.util.Random();
        anchorX = gen.nextInt(650) + 100;
        anchorY = gen.nextInt(500);
        size = s;
    } // end of constructor
    
    
    // setters
    public void setAnchorX( Integer x ) {
        anchorX = x;
    } // end of setAnchorX
    
    public void setAnchorY( Integer y ) {
        anchorY = y;
    } // end of setAnchorY
    
    public void setSize( Integer s ) {
        size = s;
    }
    
    
    // getters
    public Integer getAnchorX() {
        return anchorX;
    } // end of getAnchorX
    
    public Integer getAnchorY() {
        return anchorY;
    } // end of getAnchorY

    
    public void draw( Graphics g ) {
        // back legs
        g.setColor(Color.pink);  g.fillRect(anchorX+5, anchorY+size/2, 10, size/2);
        g.setColor(Color.black); g.drawRect(anchorX+5, anchorY+size/2, 10, size/2);
        g.setColor(Color.pink);  g.fillRect(anchorX+size-15, anchorY+size/2, 10, size/2);
        g.setColor(Color.black); g.drawRect(anchorX+size-15, anchorY+size/2, 10, size/2);
        // front legs
        g.setColor(Color.pink);  g.fillRect(anchorX+18, anchorY+size/2, 5, size/2-5);
        g.setColor(Color.black); g.drawRect(anchorX+18, anchorY+size/2, 5, size/2-5);
        g.setColor(Color.pink);  g.fillRect(anchorX+size-23, anchorY+size/2, 5, size/2-5);
        g.setColor(Color.black); g.drawRect(anchorX+size-23, anchorY+size/2, 5, size/2-5);
        // body
        g.setColor(Color.pink);  g.fillOval(anchorX+5, anchorY, size-10, size-10);
        g.setColor(Color.black); g.drawOval(anchorX+5, anchorY, size-10, size-10);
        // head
        g.drawOval(anchorX+size/4, anchorY+size/4-5, size/2, size/2);
        // nose
        g.drawOval(anchorX+size/2-5, anchorY+size/2-7, 10, 10);
        g.drawLine(anchorX+size/2-2, anchorY+size/2-5, anchorX+size/2-2, anchorY+size/2-2);
        g.drawLine(anchorX+size/2+2, anchorY+size/2-5, anchorX+size/2+2, anchorY+size/2-2);
        // eyes
        g.fillOval(anchorX+size/2-10, anchorY+size/4+5, 5, 5);
        g.fillOval(anchorX+size/2+5, anchorY+size/4+5, 5, 5);
    
    } // end of draw
    
} // end of class Piggie
