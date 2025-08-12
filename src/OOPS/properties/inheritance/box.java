package OOPS.properties.inheritance;

public class box {
    double l;
    double w;
    double h;

    box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }

    //cube
    box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    box(box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;

    }
    public void information(){
        System.out.println("Running the box");
    }
}
