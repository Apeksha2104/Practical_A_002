class FullAlphabetPyramid {
    public static void main(String[] args) {
        int n = 5;

        // 🔹 Alphabet Triangle (Centered Increasing)
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }

        // 🔹 Star Triangle (Centered Decreasing)
        for (int i = n; i >= 1; i--) {

            // spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}