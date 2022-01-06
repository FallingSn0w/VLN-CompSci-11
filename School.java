import java.util.ArrayList;
import java.util.Scanner;
//School class holds all the methods to add or remove both Students and Teacher objects, along with the methods to or print out all of each object class.
public class School {
    //Three basic fields for the school.
String schoolName;
String schoolType;
int worldWideRank;
public static String line = ("========");

School (String schoolName, String schoolType, int worldWideRank){
    //constructor for the School class object.
this.schoolName = schoolName;
this.schoolType = schoolType;
this.worldWideRank = worldWideRank;

}
    //getter "getSchoolName" gets the school name using a Scanner.
    public String getSchoolName() {
        System.out.println("Please enter school name: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //Sets the input to be the schoolName.
        schoolName = input;
        return schoolName; }
    //setSchoolName setter.
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName; }
        //getter "getSchoolType" gets the school type using a Scanner.
    public String getSchoolType() {
        System.out.println("Please enter school type (public/private etc.): ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //Sets the input to be the school type.
        schoolType = input;
        return schoolType; }
//setSchoolType setter
    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType; }
    //getter "getWorldWideRank" gets the school ranking using a scanner.
    public int getWorldWideRank() {
        System.out.println("Please enter school ranking (integer value): ");
        Scanner scan = new Scanner(System.in);
        //this code checks if the input is an integer value.
        if(scan.hasNextInt()){ this.worldWideRank = scan.nextInt();}
        //if not, it will re-run the method.
        else {
            System.out.println("This is not an integer value.");
            getWorldWideRank(); }
        //Prints school information in a composed sentence.
        System.out.println(this.schoolType+ " school "+this.schoolName+", ranked #"+this.worldWideRank+" worldwide!");
        return worldWideRank; }

//setWorldWideRank setter.
    public void setWorldWideRank(int worldWideRank) {
        this.worldWideRank = worldWideRank;
}

//Method "AddStudents" adds student class objects to the "studentList" arrayList.
public static void AddStudents(ArrayList<Student> studentList){
    String line = ("______");
    //Scanner to find out how many students are to be created and added to the list.
    System.out.println("Please enter how many students you would like to add to the school: ");
    Scanner scan = new Scanner(System.in);
    int arraySize;
    //check to see if the input is an integer value.
    if(scan.hasNextInt()){
        //sets input value to be how many times the for loop is going to repeat.
        arraySize = scan.nextInt();
        //creating an instance of a Student class object.
        Student aStudent = new Student("","",0);
        //for loop creates new instances of Student class object.
        for(int i = 0; i<arraySize; i++) {
            Student newStudent = new Student(aStudent.getStudentFName(), aStudent.getStudentFName(), aStudent.getStudentGrade());
            //for loop fills the "studentList" with "newStudent"'s each with their own information assigned to them.
            studentList.add(newStudent);
            //prints out the information assigned to each instance.
            System.out.println(studentList.get(i));
            System.out.println(line.repeat(10));}
        //Prints out the studentList arrayList using a toString method.
        System.out.println(studentList.toString());
        System.out.println(line.repeat(10));
    }
    else {
        //if the initial input was not an integer value, it will run this code, which simply re-runs the method.
        System.out.println("This is not an integer value.");
       AddStudents(studentList);}
}
//Very similar to the "AddStudent" method, creates teacher class objects to add to the "teacherList" ArrayList.
public static void AddTeachers(ArrayList<Teacher> teacherList){
    String line = ("______");
    //gets the amount of teachers to create using a scanner.
    System.out.println("Please enter how many teachers you would like to add to the school: ");
    Scanner scan = new Scanner(System.in);
    //checks to ensure the input value is an integer.
    if(scan.hasNextInt()){
    int arraySize = scan.nextInt();
    //creates a blank "Teacher" that will be used to as a template for the "newTeacher"'s.
    Teacher aTeacher = new Teacher("","","");
    for(int i = 0; i<arraySize; i++){
        //gets and assigns values to the "newTeacher" using methods from the Teacher class.
        Teacher newTeacher = new Teacher(aTeacher.getTeacherFName(), aTeacher.getTeacherLName(), aTeacher.getTeacherSubject());
        //adds the "newTeacher" to the ArrayList.
        teacherList.add(newTeacher);
        System.out.println(teacherList.get(i));
        //Prints out the new Teacher bject that is to be added to the list.
        System.out.println(line.repeat(10));}
    //Prints the arrayList using a toString method.
    System.out.println(teacherList.toString());
    System.out.println(line.repeat(10));}
    //if the initial input was not an integer value, it will run this code, which simply re-runs the method.
    else{
        System.out.println("This is not an integer value.");
        AddTeachers(teacherList);
    }
}
//"DelStudent" method removes a Student from the "studentList" ArrayList.
public static void DelStudent(ArrayList<Student> studentList){
    //prompts user input.
    System.out.println("Please enter the first name of the student you would like to remove: ");
    //Prints student array list using a toString method.
    System.out.println(studentList.toString());
    System.out.println(line.repeat(10));
    //Scanner to receive which student the computer is to look for in the arrayList.
Scanner scan = new Scanner(System.in);
String delStudent = scan.nextLine();
//for loop goes through each object in the arrayList and pulls up the objects assigned "first name", if it matches the input, it is removed.
for(int i = 0; i<studentList.size(); i++){if((studentList.get(i).GetStudentFName()).equals(delStudent)){
studentList.remove(i); }}
    System.out.println(line.repeat(10));
//Prints out the new ArrayList.
    System.out.println(studentList.toString());
}
//Very similar to the DelStudent method, removes a teacher object from the "teacherList" ArrayList.
public static void DelTeacher(ArrayList<Teacher> teacherList){
    //prompts user to provide a name.
    System.out.println("Please enter the first name of the teacher you would like to remove: ");
    System.out.println(teacherList.toString());
    System.out.println(line.repeat(10));
    //Scanner receives the name that the code will look for.
    Scanner scan = new Scanner(System.in);
    String delTeacher = scan.nextLine();
    //for loop looks for the name in the arrayList using the ArrayList's built in .get() method paired with the "GetTeacherFName" method from the teacher class.
    for(int i = 0; i<teacherList.size(); i++){if((teacherList.get(i).GetTeacherFName()).equals(delTeacher)){
        teacherList.remove(i); }}
    //Prints out the new ArrayList using the Teacher class toString method.
    System.out.println(teacherList.toString());
    System.out.println(line.repeat(10));
    }
    //Prints out the studentList ArrayList using the Student class toString method.
    public static void PrintStudentList(ArrayList<Student> studentList){
        System.out.println(studentList.toString());
        System.out.println(line.repeat(10));}
        //Prints out the teacherList ArrayList using the Teacher class toString method.
    public static void PrintTeacherList(ArrayList<Teacher> teacherList){
        System.out.println(teacherList.toString());
        System.out.println(line.repeat(10));}
        //Prints all of the predetermined courses from the "courseList" ArrayList.
        public static void PrintCourseList(ArrayList<String> courseList){
    //using the built-in ".add()" method form the ArrayList pack, courses are added to the ArrayList.
    courseList.add("Math");
    courseList.add("Physics");
    courseList.add("Chemistry");
    courseList.add("Biology");
    courseList.add("Computer Programming");
    courseList.add("English");
    System.out.println(courseList.toString());
    System.out.println(line.repeat(10));
        }
}
