class Avgmarks {
    public static double average(int... marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum/marks.length;
    }
    public static void main(String[] args) {
        double avg = average(85, 90, 78);
        System.out.println("Average = " + avg);
    }
}
