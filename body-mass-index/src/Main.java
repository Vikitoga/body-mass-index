public class Main {
    public static void main(String[] args) {
        BmiService bodyMassIndex = new BmiService();
        double weight = 70.5;
        double height = 1.80;
        double bmi = bodyMassIndex.calculate(weight, height);
        System.out.println("Индекс массы тела при весе - " + weight + " кг и росте - " + height + " м, составляет:");
        System.out.printf("%.2f", bmi);
    }
}
