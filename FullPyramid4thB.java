public class FullPyramid4thB {

    public static void main(String[] args) {

        int n = 5;

        // -------- Pattern 1: Centered Star Pyramid --------
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // -------- Pattern 2: Centered Letter Pyramid --------
        for (int i = n; i >= 1; i--) {

            char ch = 'A';

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // letters
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}
