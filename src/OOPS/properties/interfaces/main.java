package OOPS.properties.interfaces;

public class main {
    public static void main(String[] args) {
//        car Alto = new car();
//        Alto.acc();
//        Alto.disc();
//        Alto.brake();
//        Alto.start();//isme engine ki jgh pr music ka de rha hai
//
//        media Alto1 = new media();
//        Alto1.start();//isme music ki jgh pr engine ka de rha hai

 //since hmne alg classes banai like power engine ,electric engine and media
 //aur in sbko call kiya nice car mein
nicecar car1 = new nicecar();
car1.start();//powerengine
car1.startmusic();
car1.upgradingengine();//upgrade to electric engie
car1.start();//electric engine
    }
}
