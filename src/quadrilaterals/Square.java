package quadrilaterals;
/**
 *
 * @author Carol
 */
public class Square extends Quadrilaterals{
    double side;
    
    public Square(){
        side=0.0;
    }
    
    public double perimeter(){
        return 4*side;
    }
    
}
