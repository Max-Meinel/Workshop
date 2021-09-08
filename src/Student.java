public class Student {
    private int id;
    private String name;
    private int punkte;
    private String geschlecht;

    Student(int id, String name, String geschlecht) {
        this.id = id;
        this.name = name;
        this.geschlecht = geschlecht;
    }

    public int getPunkte() {
        return punkte;
    }

    public String getGeschlecht() {
        return geschlecht;
    }
}
