package OOPS.properties.inheritance;

public class boxweight extends box{
    double weight;
    public boxweight(double weight){
        this.weight=weight;
    }
    public boxweight(){
        this.weight=0;
    }
    public boxweight(double l,double w,double h,double weight){
        super(l,w,h);
        this.weight=weight;
    }
}
