package OOPS;

public class SYNTAX {
    public static void main(String[] args) {
        class Student{
            int roll;
            String name;
            String address;

            void greeting(){
                System.out.println("Hello my name is "+this.name);
            }
            void changename(String name){
                this.name=name;
            }

//            Student(){
//                this.roll = 1;
//                this.name = "Rudra Sharma";
//                this.address = "goplanajge";
//            }
            Student(Student other){
                this.roll = other.roll;
                this.name = other.name;
                this.address = other.address;
            }

            Student(int rollno,String naam,String ghrkapta){
                this.roll=rollno;
                this.name=naam;
                this.address=ghrkapta;
            }

            Student(){
                this(13,"default person","suw");
            }
        }
        Student Rudra = new Student(25,"Sharmaji","Jungle");
        Student random=new Student(Rudra);
        Student random2=new Student();
//        System.out.println(Rudra.roll);
//        Rudra.changename("RudY Montoo");
//        Rudra.greeting();
        System.out.println(Rudra.roll);
        System.out.println(Rudra.name);
        System.out.println(Rudra.address);
        System.out.println(random.name);
        System.out.println(random2.name);
    }
}
