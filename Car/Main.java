package Car;

public class Main {
    public static void main(String[] args) {
        // Először példányosítunk egy Supercar osztályú objektumot
        // ami meghívja a Car szülőosztályának konstruktorát, ami
        // aztán meghívja saját Vehicle szülőosztályáét és
        // "nagyszülőtől" lefelé lefutnak a konstruktoraik
        Vehicle firstVehicle = new Supercar();
        // firstVehicle Supercar típusú, lefut a start() metódusa
        firstVehicle.start();
        // Szülőosztálya a Car osztály így "true", hogy a példánya
        System.out.println(firstVehicle instanceof Car);
        // Cast-oljuk a Supercar objektumot Car-ra
        Car secondVehicle = (Car) firstVehicle;
        // Shallow Copy miatt ugyanaz a címe az objektumnak
        // így tehát a kívánt Car típus helyett marad Supercar
        // típusú és kiírjuk mégegyszer ugyanazt
        secondVehicle.start();
        // továbbra is maradt Supercar tehát "true"
        System.out.println(secondVehicle instanceof Supercar);
        // A szülőosztály nem éri el a gyermek tulajdonságait,
        // visszafelé nem működik az öröklődés
        // Supercar thirdVehicle = new Vehicle();
        // Exception, nem fut tovább a program
        // thirdVehicle.start();
    }
}
