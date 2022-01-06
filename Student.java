import java.util.Scanner;
//Student object class.
public class Student {
    //Student objects have five fields
    private String studentFName;
    private String studentLName;
    private int studentGrade;
    private int studentID;
    //Static so that I can have a constant value that cannot be changed by anything else throughout the entirety of the time the code is running.
    private static int studentIDNum;
//Student object constructor.
    Student(String studentFName, String studentLName, int studentGrade){
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.studentGrade = studentGrade;
        this.studentID = studentIDNum;
        //every time a new student object is made, increment the "studentIDNum" value creating a unique value that can be assigned to each Student Object.
        studentIDNum++;
    }
//the "getStudentFName" method gets the first name of a student object using a scanner.
    public String getStudentFName() {
        System.out.println("Please enter Student First Name: ");
        Scanner scan = new Scanner(System.in);
        this.studentFName = scan.nextLine();
        //returns the studentFName value.
        return studentFName;
    }
//studentFName setter.
    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }
//the "getStudentLName" method gets the last name of a student object using a scanner.
    public String getStudentLName() {
        System.out.println("Please enter Student Last Name: ");
        Scanner scan = new Scanner(System.in);
        this.studentLName = scan.nextLine();
        //return the studentLName value.
        return studentLName;
    }
//studentLName setter.
    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }
//the "getStudentGrade" method gets the grade level value of a student object using a scanner.
    public int getStudentGrade() {
        //prompts user to input a grade value.
        System.out.println("Please enter Student Grade Level: ");
        Scanner scan = new Scanner(System.in);
        //this if statement checks if the input is an integer value.
        if(scan.hasNextInt()){ this.studentGrade = scan.nextInt();}
        else {
            //if the input is not a value, it will re-run the method.
            System.out.println("This is not an integer value.");
            getStudentGrade(); }
        //returns the studentGrade.
        return studentGrade;
    }
    //studentGrade setter.
    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    //"GetStudentFName" is a separate method that still return the studentFName and functions as an alternate studentFName getter metthod.
    //Instead of prompting for a value and assigning it, it simply assigns the current value and returns it.
    //This method is used in the "DelStudent" method to find a student object's first name within the ArrayList.
    public String GetStudentFName(){
        this.studentFName = studentFName;
        return studentFName;
    }
    //Overrides previous pre-set "toString" method.
    @Override
    public String toString (){
        //prints Student class objects in a composed line.
        return "\n Student no."+this.studentID+":   Name: "+this.studentFName+" "+this.studentLName+", Gr"+this.studentGrade; }
}
