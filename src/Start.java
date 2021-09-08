public class Start {
    public static void main(String[] args) {
        Workshop w1 = new Workshop();


        for (int i = 0; i < 10; i++) {
            w1.erstelleStudent("meinName", "meinGeschlecht");
        }
    }
}
