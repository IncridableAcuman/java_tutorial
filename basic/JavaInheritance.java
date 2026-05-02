public class JavaInheritance {
    public static void main(String[] args) {

//        Exception exception = new Exception(200, "Success");
//        System.out.println(exception.display());

//        Student student = new Student(1, "Urgench State University", 1, "Telecommunication", 1, "Izzatbek", 4);
//        System.out.println(student.display());
    }
}
// -------------------------------------------- Single Inheritance ---------------------------------------------------

class Exception extends Status{
    private String message;

    Exception(int status,String message){
        super(status);
        this.message=message;
    }
   @Override public String display(){
        return super.display() + "\nMessage: " + message;
    }
}

class Status {
    private int status;

    Status(int status){
        this.status=status;
    }
    public String display(){
        return "Status: " + status;
    }
}
// -------------------------------------------- Single Inheritance ---------------------------------------------------


// -------------------------------------------- Multiple Inheritance ---------------------------------------------------
class Student extends Cafedra {
    private int studentID;
    private String studentName;
    private int studentCourse;

   Student(int universityID,String universityName,int cafedraID,String cafedraName,int studentID,String studentName,int studentCourse){
       super(universityID,universityName,cafedraID,cafedraName);
       this.studentID=studentID;
       this.studentName=studentName;
       this.studentCourse=studentCourse;
   }
   @Override
   public String display(){
        return (super.display() + "\nStudent ID: " + studentID + "\nStudent Name: " + studentName + "\nStudent Course: " + studentCourse);
        }
        }
class Cafedra extends University{
    private int cafedraID;
    private String cafedraName;

    Cafedra(int universityID,String universityName,int cafedraID,String cafedraName){
        super(universityID,universityName);
        this.cafedraID=cafedraID;
        this.cafedraName=cafedraName;
    }
    @Override
    public String display(){
        return (super.display() + "\nCafedraID: " + cafedraID + "\nCafedra Name: " + cafedraName);
    }
}

class University {
    private int universityID;
    private String universityName;

    University(int id,String name){
        this.universityID=id;
        this.universityName=name;
    }
    public String display(){
        return ("University ID: " + universityID + "\nUniversity Name: " + universityName);
    }
}
// -------------------------------------------- Multiple Inheritance ---------------------------------------------------
