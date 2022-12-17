package arraylist;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        studentLee.showStudentInfo();
        System.out.println(studentLee.getStudentID());


        Student studentKim = new Student("Lee");
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 90);
        studentKim.addSubject("영어", 80);

        studentKim.showStudentInfo();
        System.out.println(studentKim.getStudentID());



    }
}
