class NestedForLoopExample {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}



