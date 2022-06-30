public class Task7 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2020, 125, 10000);
        Airplane airplane2 = new Airplane("Airbus", 2020, 110, 9500);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
