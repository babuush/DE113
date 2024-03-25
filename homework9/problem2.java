public class problem2 {

    public double getHottest(double[] temp) {
        double max = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        problem2 p = new problem2(); // Create an instance of problem2
        double[] temperature = new double[365];
        double hottest = p.getHottest(temperature);
        System.out.println("Hottest temperature: " + hottest);
    }
}
