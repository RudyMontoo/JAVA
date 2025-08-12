package OOPS.properties.inheritance;

public class boxprices extends boxweight{
    double price;
    public boxprices(double price){
        this.price=price;
    }
    public boxprices(double price,double weight,double l,double w,double h){
        super(l, w, h, weight);
        this.price=price;
    }
}
