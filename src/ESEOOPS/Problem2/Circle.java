package ESEOOPS.Problem2;

public  class Circle implements Problem2Shape{
int r;
Circle(int r){
    this.r=r;
}
    public void calculateArea() {
    System.out.println("Area of Circle "+"-"+3.14*Math.pow(r,2));
}
}
