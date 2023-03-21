package quadrilaterals;
/**
 *
 * @author Carol
 */
public class Parallelogram extends Quadrilaterals{
    double height;
    
    public Parallelogram(){
        height=0.0;
    }
    
    public double perimeter(){
        return 2*this.length+2*this.width;
    }
    
}
