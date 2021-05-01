/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaterals;

/**
 *
 * @author Carol
 */
import java.util.Scanner;
import java.util.InputMismatchException;

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
  
//    public double getValue(String instruction){
//        System.out.print(instruction);
//        Scanner input = new Scanner(System.in);
//        double val;
//        while (true){
//            try{
//                val=input.nextDouble();
//                break;
//            }
//            catch (InputMismatchException err){
//                input.next();
//                System.out.print("Not a number, try again! "+instruction);
//            }
//        }
//        return val;
//    }
    
    private static boolean isDouble(String toCheck){
        try {
            double value = Double.parseDouble(toCheck);
            return true;
        }
        catch(InputMismatchException err){
            System.out.println("Not a number, try again please.");
            return false;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrilaterals quad1 = new Quadrilaterals();
        String strNumber="";
        do{
            
        }while (isDouble(strNumber));
        
    }
    
}
