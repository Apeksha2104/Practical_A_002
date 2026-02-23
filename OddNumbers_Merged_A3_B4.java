public class OddNumbers_Merged_A3_B4 {

    public static void main(String[] args) {

        // ===== PART 1: Odd Numbers 1 to 50 (Set B) =====
        int sum50 = 0, count50 = 0;

        System.out.println("Odd numbers between 1 and 50:");

        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
            sum50 += i;
            count50++;
        }

        System.out.println("\nMinimum 3 odd numbers: 1 3 5");
        System.out.println("Maximum 3 odd numbers: 45 47 49");

        double avg50 = (double) sum50 / count50;
        System.out.println("Average: " + avg50);


        // ===== PART 2: Odd Numbers 1 to 100 (Set A) =====
        int sum100 = 0;

        System.out.println("\nOdd numbers between 1 and 100:");

        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
            sum100 += i;
        }

        System.out.println("\nMinimum: 1");
        System.out.println("Maximum: 99");
        System.out.println("Total Sum: " + sum100);
    }
}
