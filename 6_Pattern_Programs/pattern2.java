public class pattern2 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i+j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
