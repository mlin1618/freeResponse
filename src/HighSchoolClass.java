/**
 * Created by Nilxam on 11/10/16.
 */
public class HighSchoolClass {
    private Student[] students;
    public Student getValedictorian(){
        int max = 0;
        for(int i = 0; i < students.length;i++){
            if(students[i].getGPA()>students[max].getGPA()){
                max = i;
            }
        }
        return students[max];
    }
    private double getHonorsPercentage(){
        double counter = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i].isHonors()){
                counter= counter+1;
            }
        }
        return counter/students.length;
    }
}
