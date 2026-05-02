public class JavaConstructor {
    public static void main(String[] args) {
        //Car car = new Car();
//        Country country = new Country("Uzbekistan",12);
//        country.display();
        Student student1 = new Student(1);
        student1.display();
        Student student2 = new Student(2,"Ali");
        student2.display();
        Student student3 = new Student(3,"Vali",25);
        student3.display();
        Student student4 = new Student(student3);
        student4.display();
    }
}

// Default Constructor
class Car {
    Car(){
        System.out.println("This is Default constructor");
    }
}
// Parametr Constructor
class Country {
    private String name;
    private int stateNumber;

    Country(String name,int stateNumber){
        this.name=name;
        this.stateNumber=stateNumber;
    }
    public void display(){
        System.out.println(name + " " + stateNumber);
    }
}
// Difference Parametr Constructor
class Student {
    private int studentID;
    private String studentName;
    private int studentAge;

    Student(int id){
        this.studentID=id;
    }
    Student(int id,String  name){
        this.studentID=id;
        this.studentName=name;
    }
    Student(int id,String name,int age){
        this.studentID=id;
        this.studentName=name;
        this.studentAge=age;
    }

    Student(Student student){
        this.studentID = student.studentID;
        this.studentName = student.studentName;
        this.studentAge = student.studentAge;
    }

    public void display(){
        System.out.println("Student ID: " + studentID + " " + "Student Name: " + studentName + " " + "Student Age: " + studentAge);
    }
}