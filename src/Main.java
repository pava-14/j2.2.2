public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        float mass = 79.3F; // Масса в килограммах
        float height = 1.74F; // Рост в метрах
        float bmi = service.calculate(mass, height);
        System.out.printf("%.2f",bmi);
    }
}
