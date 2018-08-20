import java.util.Scanner;

public class Enhanced_For {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,r,c,j;
        System.out.println("Enter dimension: ");
        r = sc.nextInt();
        c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter values: ");
        for(i=0; i<r; i++) {
            for(j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("*****Values are*****");
        for(int k[] : arr) {
            for(int m : k) {
                System.out.print(m+"\t");
            }
            System.out.println();
        }
    }
}
