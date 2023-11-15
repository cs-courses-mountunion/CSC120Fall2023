import java.awt.*;

public class EnglishMonarch {
    
    private String  name;
    private Integer firstYear, lastYear;
    private Boolean startedNewHouse;
    
    
    // constructor
    public EnglishMonarch( String n, Integer fY, Integer lastY, Boolean nH ) {
        name = n;
        firstYear = fY;
        lastYear = lastY;
        startedNewHouse = nH;
    } // end of constructor
    
    
    // getters
    
    public String getName() {
        return name;
    }
    
    public Integer getFirstYear() {
        return firstYear;
    } // end of getFirstYear
    
    public Integer getLastYear() {
        return lastYear;
    } // end of getLastYear

    public Boolean getStartedNewHouse() {
        return startedNewHouse;
    } // end of getStartedNewHouse()

    

    public String toString() {
        String answer;
        
        answer = name + ", who ";
        if (startedNewHouse == false) {
            answer += "did not start ";
        }
        else {
            answer += "started ";
        }
        answer += "a new House of Royalty, was English Monarch from " + firstYear + " to " + lastYear + ".";
                
        return answer;
    } // end of toString
    
    
} // end of class EnglishMonarch
