package quadrilaterals;

/**
 *
 * @author Carol
 */
import java.util.Scanner;
import java.lang.NumberFormatException;

public class Quadrilaterals {
    /**
     * @param args the command line arguments
     */
    double length;
    double width;
    
    public Quadrilaterals(){
        length=0.0;
        width=0.0;
    }
    
    public Quadrilaterals(double l,double w){
        length=l;
        width=w;
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double newLength) {
        this.length = newLength;
    }
  
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }
  
    private static double getValue(String instruction){
        System.out.print(instruction);
        Scanner in = new Scanner(System.in);
        String strNumber;
        do{
            strNumber=in.next();
        }while (!isDouble(strNumber));
        return Double.parseDouble(strNumber);
    }
    
    private static boolean isDouble(String toCheck){
        try {
            double value = Double.parseDouble(toCheck);
            return true;
        }
        catch(NumberFormatException err){
            System.out.println("Not a number, try again please.");
            return false;
        }
    }
    
    public static void main(String[] args) {
        Quadrilaterals quad1 = new Quadrilaterals();
        quad1.setLength(getValue("What is the length? "));
        quad1.setWidth(getValue("What is the width? "));
        
        
    }
    
}
