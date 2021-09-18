public class Main {
    public static void main(String[] args) {
        BmiService bodyMassIndex = new BmiService();
        double weightInKilograms = 70.5;
        double heightInMeters = 1.80;
        double bmi = bodyMassIndex.calculate(weightInKilograms, heightInMeters);
        System.out.println("Индекс массы тела при весе - " + weightInKilograms + " кг и росте - " + heightInMeters + " м, составляет:");
        System.out.printf("%.2f", bmi);
    }
}
