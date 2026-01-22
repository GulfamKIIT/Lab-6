class Bank {


    double rate = 5.0;


    static class InterestCalculator {

        static double calculateSI(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        /*
        void showRate() {
            System.out.println(rate);
        }
        */
    }

    public static void main(String[] args) {

        double si = InterestCalculator.calculateSI(1000, 5, 2);
        System.out.println("Simple Interest = " + si);
    }
}
