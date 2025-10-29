package Threading;
//Bus_Booking
public class Booking  {
     int totalSeat=20;
     synchronized void bookSeat(int seat){
        if(totalSeat>=seat){
            System.out.println(Thread.currentThread().getName()+" booking "+seat);
            totalSeat=totalSeat-seat;
            System.out.println("Remaining seat : "+totalSeat);
        }
        else{
            System.out.println("Sorry " +Thread.currentThread().getName()+" not have enough seat ");
            System.out.println("Remaining seat : "+totalSeat);
        }
    }
}


class BookingSeat extends Thread{
    static Booking book=new Booking();
    int seat;
    public void run(){
        book.bookSeat(seat);
    }

    public static void main(String[] args) {
        BookingSeat p1=new  BookingSeat();
        p1.seat=10;
        p1.setName("Passenger1");
        p1.start();

        BookingSeat p2=new  BookingSeat();
        p2.seat=12;
        p2.setName("Passenger2");
        p2.start();
    }
}
