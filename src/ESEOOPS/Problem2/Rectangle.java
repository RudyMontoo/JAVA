package ESEOOPS.Problem2;

public  class Rectangle implements Problem2Shape {

    int l;
    int b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void calculateArea(){
        System.out.println("Area of Rectangle"+" "+l*b);

    }
}
