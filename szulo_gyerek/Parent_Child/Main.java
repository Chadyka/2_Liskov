package szulo_gyerek.Parent_Child;

public class Main {
    public static void main(String[] args) {
        Parent s = new Child();
        s.setName("Mother");
        s.setAge(60);
        Child gy = new Child();
        s.setName("Laci");
        s.setAge(15);
        System.out.println(gy.getName() + "  " + s.getName());
    }
}