/* CSC 120
 * Practicum # 2
 *
 * Samantha Student
 *
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {



    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(1000, 600));
        setName("Practicum # 2 authored by Samantha Student");
        setUp();
        setUpTextArea();
        setBackground(Color.GREEN);

        
        
        

        //*** 
        //    You must instantiate the array with the proper number of elements before this point
        //
        //    Here is information for instantiating each element of the array:
        //
        //    Aethelred the Unready did not start a House and was Monarch from 978 to 1013
        //    Alfred the Great started the House of Wessex and was Monarch from 886 to 899
        //    Edgar the Peaceful did not start a House and was Monarch from 959 to 975
        //    Edward I Longshanks did not start a House and was Monarch from 1272 to 1307
        //    Elizabeth II did not start a House and was Monarch from 1952 to 2022
        //    George III did not start a House and was Monarch from 1760 to 1820
        //    Harold II started the House of Godwin and was Monarch from 1065 to 1066
        //    Henry VIII did not start a House and was Monarch from 1509 to 1547
        //    James I started the House of Stuart and was Monarch from 1603 to 1625
        //    Richard the Lionheart did not start a House and was Monarch from 1189 to 1199
        //    Victoria I did not start a House and was Monarch from 1837 to 1901
        //    William the Conqueror started the House of Normandy and was Monarch from 1066 to 1087
        
        

        outputArea.append("===========================\n");
        outputArea.append("\nAll English Monarchs in the array:\n\n");
        displayAllEnglishMonarchs();
        
        outputArea.append("\n===========================\n");
        outputArea.append("\nEnglish Monarchs since 1600 in the array:\n\n");
        displayEnglishMonarchsSince1600();
        
        outputArea.append("\n===========================\n");
        outputArea.append("\nEnglish Monarchs that started new Houses:\n\n");
        displayMonarchsWhoStartedNewHouses();
        
        
    } // end of constructor
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        
    } // end of paintComponent()
    
    
    public void displayAllEnglishMonarchs() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    public void displayEnglishMonarchsSince1600() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    
    public void displayMonarchsWhoStartedNewHouses() {
        
        outputArea.append("   NOT YET IMPLEMENTED BY STUDENT" + "\n");
        
    }    
       
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    private TextArea outputArea;
    
    public void setUpTextArea() {
        outputArea = new TextArea();
        outputArea.setBounds(20, 20, 960, 560);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(outputArea);
    }
    
    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
