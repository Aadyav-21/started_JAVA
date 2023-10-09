package basicsofJAVA;

public class objects {
     int rollNo;
     String studentName;

    public static void main(String[] args) {
        objects obj1 = new objects();
        obj1.rollNo = 1;
        obj1.studentName= "Aadya";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);
        objects obj2 = new objects();
    }
}
