class Odd_numbers {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Odd numbers between 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\n\nMinimum odd number: 1");
        System.out.println("Maximum odd number: 99");
        System.out.println("Sum of odd numbers: " + sum);
    }
}
