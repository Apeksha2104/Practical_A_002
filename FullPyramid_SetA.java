public class FullPyramid_SetA {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }
    }
}