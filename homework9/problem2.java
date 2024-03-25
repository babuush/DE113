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

    public double getColdest(double[] temp) {
        double min = temp[0];
        for (int i = 1; i < temp.length; i++) {
            if (min > temp[i]) {
                min = temp[i];
            }
        }
        return min;
    }

    public double avgMonth(double[] temp, int month) {
        int count = 0;
        double sum = 0;
        // Assuming month indices start from 1
        for (int i = (month - 1) * 30; i < month * 30; i++) {
            sum += temp[i];
            count++;
        }
        return sum / count;
    }

    public double diffTemp(double[] temp, int month) {
        // Assuming month indices start from 1
        int startDay = (month - 1) * 30;
        int endDay = month * 30 - 1;
        double hottest = temp[startDay];
        double coldest = temp[startDay];
        for (int i = startDay + 1; i <= endDay; i++) {
            if (temp[i] > hottest) {
                hottest = temp[i];
            }
            if (temp[i] < coldest) {
                coldest = temp[i];
            }
        }
        return hottest - coldest;
    }

    public double getTempOfDay(double[] temp, int month, int day) {
        // Assuming month indices start from 1 and days start from 1
        int index = (month - 1) * 30 + (day - 1);
        return temp[index];
    }

    public static void main(String[] args) {
        problem2 p = new problem2(); // Create an instance of problem2
        double[] temperature = new double[365];
        // Assume temperature array is filled with actual temperature data

        double hottest = p.getHottest(temperature);
        double coldest = p.getColdest(temperature);
        System.out.println("Hottest temperature: " + hottest);
        System.out.println("Coldest temperature: " + coldest);

        //Calculate the average temperature for January
        int january = 1;
        double avgJanuary = p.avgMonth(temperature, january);
        System.out.println("Average temperature for January: " + avgJanuary);

        //Calculate the difference in temperature for January
        double diffJanuary = p.diffTemp(temperature, january);
        System.out.println("Difference in temperature for January: " + diffJanuary);

        //Get the temperature for January 15th
        double tempJan15 = p.getTempOfDay(temperature, january, 15);
        System.out.println("Temperature for January 15th: " + tempJan15);
    }
}
