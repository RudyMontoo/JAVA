package OOPS.Enumeration;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }

    public static void main(String[] args) {
        Week week = Week.Monday;
        if(week==Week.Monday){
            System.out.println("Monday");
        }
    }
}
