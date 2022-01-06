import java.util.Scanner;
//Teacher objects have three fields.
public class Teacher {
    String teacherFName;
    String teacherLName;
    String teacherSubject;
//Teacher object constructor.
Teacher(String teacherFName, String teacherLName, String teacherSubject){
this.teacherFName = teacherFName;
this.teacherLName = teacherLName;
this.teacherSubject = teacherSubject;
}
//Method "getTeacherFName" gets a Teacher object's first name using a scanner.
    public String getTeacherFName() {
    //prompts user input.
        System.out.println("Please enter Teacher First Name: ");
        Scanner scan = new Scanner(System.in);
        //assigns input to be the teacherFName.
        this.teacherFName = scan.nextLine();
        //returns teacherFName.
        return teacherFName;
    }
//"teacherFName" setter.
    public void setTeacherFName(String teacherFName) { this.teacherFName = teacherFName; }
//Method "getTeacherLName" gets a teacher object's last name using a scanner.
    public String getTeacherLName() {
        System.out.println("Please enter Teacher Last Name: ");
        Scanner scan = new Scanner(System.in);
        this.teacherLName = scan.nextLine();
        //returns teacherLName.
        return teacherLName;
    }
//"teacherLnName" setter.
    public void setTeacherLName(String teacherLName) { this.teacherLName = teacherLName; }
//Method "getTeacherSubject" gets the teacher object's subject using a scanner.
    public String getTeacherSubject() {
        System.out.println("Please enter Teacher Subject: ");
        Scanner scan = new Scanner(System.in);
        //sets and returns the teacherSubject value.
        this.teacherSubject = scan.nextLine();
        return teacherSubject;
    }
    //"teacherSubject" setter
    public void setTeacherSubject(String teacherSubject) { this.teacherSubject = teacherSubject; }
    //Method "GetTeacherFName" is used in the "DelTeacher" method from the School class.
    //Instead of prompting and setting a teacherFName, it simply returns it.
    public String GetTeacherFName(){
    this.teacherFName = teacherFName;
    return teacherFName;
    }
    //Override the previous pre-set "toString" method.
    @Override
    //This toString method prints out a Teacher object in a composed sentence.
    public String toString(){
    return "\n Teacher Name: "+this.teacherFName+" "+this.teacherLName+" Subject: "+this.teacherSubject;
    }

}
