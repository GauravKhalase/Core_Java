class pattern {
    public static void main(String[] args) {
        int n = 11;

        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 0; i < n; i++) {

            // G
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || i >= (n - 1) / 2 && j == n - 1
                        || i == (n - 1) / 2 && j >= (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            // U
            for (int j = 0; j < n; j++) {
                if (i == n-1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            // R
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1 && i <= (n-1)/2 || i==j && j >= (n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) / 2 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("    ");

            // V
            // for (int j = 0; j < n; j++) {
            //     if (i == j*2) {
            //         System.out.print("* ");
            //     } 
            //     else if ((i*2)+(j*2) == ((n-1)*2)+i) {
            //         System.out.print("* ");
            //     } 
            //     else {
            //         System.out.print("  ");
            //     }
            // }

            for (int j = 0; j < n; j++) {
                if (j==i) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (i+j==n-1) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }
}