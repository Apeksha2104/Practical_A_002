public class InvertedRightHalfPyramid_SetA {

    public static void main(String[] args) {

        // Inverted Right Half Star Pyramid
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
