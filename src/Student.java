/**
 * Created by Nilxam on 11/10/16.
 */
public class Student {
    double gpa;
    boolean honors;
    String name;
    int ID;
    public Student(double g, boolean h, String n, int I){
        gpa=g;
        honors=h;
        name=n;
        ID=I;
    }
    public double getGPA(){
        return gpa;
    }
    public boolean isHonors(){
        return honors;
    }
}
