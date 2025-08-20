package OOPS.lecture6.Comparision;

public class Student implements Comparable<Student> {
    int rollno;
    float score;

    public Student(int rollno, float score) {
        this.rollno = rollno;
        this.score = score;
    }

    @Override
    public String toString() {
        return score + " " ;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int) (this.score-o.score);
        //if diff =0 both ar e equal
        //if diff <1 means o is bigger else o is smaller

        return diff;
    }



}
