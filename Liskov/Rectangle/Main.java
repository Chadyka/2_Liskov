package Liskov.Rectangle;

class Main {
    private static Rectangle getNewSquare() {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle r = Main.getNewSquare();
        r.setWidth(5);
        r.setHeight(10);
        System.out.println(r.getArea());
    }
}