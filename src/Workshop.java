import java.util.ArrayList;

public class Workshop {
    private int lastID;
    private ArrayList<Student> studentenList = new ArrayList<Student>();

    public Workshop() {
        lastID = 0;
    }

    public void erstelleStudent(String name, String geschlecht) {
        lastID++;
        Student s1 = new Student(lastID, name, geschlecht);
        studentenList.add(s1);
    }

    public Student findeBestenStudent() {
        int maxPunkte = 0;
        Student maxPunkteStudent = null;
        for (int i = 0; i < studentenList.size(); i++) {
            if (studentenList.get(i).getPunkte() > maxPunkte) {
                maxPunkte = studentenList.get(i).getPunkte();
                maxPunkteStudent = studentenList.get(i);
            }
        }
        return maxPunkteStudent;
    }

    public int berechneAnteilWeiblich() {
        for (int i = 0; i < studentenList.size(); i++) {
            if (studentenList.get(i).getPunkte() > maxPunkte) {

            }
        }
    }
}
