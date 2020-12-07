package Liskov;

class Main {
    public static void main(String[] args) {
        Aircraft r = new Helicopter();
        r.setSpeed(300);
        r.setAltitude(1000);
        System.out.println(r.getDropSpeed());
    }
}