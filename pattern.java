class pattern {
    public static void main(String[] args) {
        int n = 5;

        // 🔹 Star Pyramid (Centered)
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

        // 🔹 Alphabet Reverse Pyramid (Centered)
        for (int i = n; i >= 1; i--) {

            // spaces
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}