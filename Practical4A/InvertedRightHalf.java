class InvertedRightHalf {
    public static void main(String[] args) {
        int n = 6;

        // 🔹 Star Increasing Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 🔹 Number Pattern
        int num = 1;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

            // reset after reaching 9 (to match your pattern)
            if (num > 9) {
                num = 1;
            }
        }
    }
}