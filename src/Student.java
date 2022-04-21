public class Student {
    String name; //null
    String surname; //null
    int age; //0
    boolean beca; //false

    String studentToString(Student alumne){
        String text = "";
        text += alumne.name + " " + alumne.surname + ", " + alumne.age + " Beca? " +
                alumne.beca;
        return text;
    }

}
