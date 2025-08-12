package OOPS.properties.inheritance;


import OOPS.properties.EXCESS.a;
public class main {
    public static void main(String[] args) {
        box BOX1 = new box();
        System.out.println(BOX1.l+" "+BOX1.h);
        box BOX2 = new box(25,56,76);
        System.out.println(BOX2.l+" "+BOX2.h);
        box cubebox=new box(25);
        System.out.println(cubebox.l+" "+cubebox.h);



        //i extend property from box class to boxweight class
    boxweight boxweight1=new boxweight(25);
    System.out.println(boxweight1.l+" "+boxweight1.h+" "+boxweight1.w+" "+boxweight1.weight);
        boxweight boxweight2=new boxweight();
        System.out.println(boxweight2.l+" "+boxweight2.h+" "+boxweight2.w+" "+boxweight2.weight);

        boxweight boxweight3=new boxweight(23,23,43,34);
        System.out.println(boxweight3.l+" "+boxweight3.h+" "+boxweight3.w+" "+boxweight3.weight);


        boxprices boxprices1=new boxprices(25);
        System.out.println(boxprices1.l+" "+boxprices1.h+" "+boxprices1.w+" "+boxprices1.weight+" "+boxprices1.price);
        boxprices boxprices2=new boxprices(1,2,3,4,25);
        System.out.println(boxprices2.l+" "+boxprices2.h+" "+boxprices2.w+" "+boxprices2.weight+" "+boxprices2.price);

    }

a obj=new a(10,"rudra");
//    obj.getNum();

}


