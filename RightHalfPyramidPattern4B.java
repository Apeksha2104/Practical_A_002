public class RightHalfPyramidPattern {

    public static void main(String[] args) {

        // -------- Pattern 1: Number Pyramid --------
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num == 10)   // reset after 9
                    num = 1;
            }
            System.out.println();
        }

        // -------- Pattern 2: Inverted Right Half Star Pyramid --------
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
