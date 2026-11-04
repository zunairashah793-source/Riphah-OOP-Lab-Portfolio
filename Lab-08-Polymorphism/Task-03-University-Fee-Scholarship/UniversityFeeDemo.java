class Fee {
    public double calculate(double tuition) {
        return tuition;
    }

    public double calculate(double tuition, double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100.");
        }
        return tuition - (tuition * percent / 100.0);
    }
}

class ScholarshipFee extends Fee {
    @Override
    public double calculate(double tuition) {
        return super.calculate(tuition, 20.0); // Default scholarship is 20%.
    }
}

public class UniversityFeeDemo {
    public static void main(String[] args) {
        double tuition = 50000.0;
        Fee regularFee = new Fee();
        Fee scholarshipFee = new ScholarshipFee();

        System.out.printf("Regular fee (no discount): Rs. %.2f%n", regularFee.calculate(tuition));
        System.out.printf("Regular fee (10%% custom discount): Rs. %.2f%n", regularFee.calculate(tuition, 10));
        System.out.printf("Scholarship fee (default 20%%): Rs. %.2f%n", scholarshipFee.calculate(tuition));
        System.out.printf("Scholarship fee (custom 10%%): Rs. %.2f%n", scholarshipFee.calculate(tuition, 10));
    }
}
