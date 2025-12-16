package ESEOOPS;

public class problem1 {
static class OL{
    int a=20;
    int b=30;
    OL(int a,int b){
        this.a=a;

        this.b=b;
    }
    OL(){}
    }
 static class OR1{
    public void area(){
        System.out.println("area");
    }
}
static class OR2 extends OR1{
    @Override
    public void area(){
        System.out.println("area of circle");
    }
}

    public static void main(String[] args){
//        System.out.println("Rudra Sharma");
//        OverLoading OL
        OL p1=new OL();
        OL p2=new OL(30,25);
        System.out.println(p2.a+p2.b);

//        Overriding

        OR2 ar=new OR2();
        ar.area();

    }
}
