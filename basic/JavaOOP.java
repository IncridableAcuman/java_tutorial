// Javada obyektlar 3-xil usulda yaratiladi.
// 1-usul: Reference yordamida
// 2-usul: Method yordamida
// 3-usul: Constructor yordamida

// Birinchi usul uchun talaba nomli class dan foydalanaman,ikkinchi usul uchun Kafedra nomli class va uchunchi
// usul uchun universitet nomli class dan foydalanaman.

public class JavaOOP {
    public static void main(String[] args) {
//  1-usul: Reference yordamida obyekt yaratish
        int studentID=1;
        String studentName = "Izzatbek";
        Student student = new Student();
        student.studentID=studentID;
        student.studentName=studentName;
        System.out.println("Birinchi usul:");
        System.out.println("Student ID: " + student.studentID + " " + student.studentName);
//   2-usul: Method yordamida obyekt yaratish
        System.out.println("Ikkinchi usul:");
        int kafedraID = 1;
        String kafedraName = "Telekommunikatsiya kafedrasi";
        Kafedra kafedra = new Kafedra();
        kafedra.qiymatBerish(kafedraID,kafedraName);
        kafedra.display();
//  3-usul: Constructor yoradamida obyekt yaratish
        System.out.println("Uchinchi usul:");
        int universitetID = 1;
        String universitetName = "Urgench State University";
        Universitet universitet = new Universitet(universitetID,universitetName);
        universitet.display();
    }
}
// 1
 class Student {
     String studentName;
     int studentID;
}
// 2
class Kafedra {
    private int karedraID;
    private String kafedraName;

    public void qiymatBerish(int id,String name){
        this.karedraID=id;
        this.kafedraName=name;
    }

    public void display(){
        System.out.println("ID: " + karedraID + " " + kafedraName);
    }
}
// 3
class Universitet {
    private int universityID;
    private String universityName;

    public Universitet(int id,String name){
        this.universityID = id;
        this.universityName = name;
    }

    public void display(){
        System.out.println("ID: " + universityID + " " + universityName);
    }
}