package Pattern;

// import java.util.Scanner;

public class InvertedHalfPyramid {
    
    public static void main(String[] args) {
        
        int n=5;
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }


        // int n;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Value:");
        // n = sc.nextInt();

        // for(int i=n;i>=1;i--){

        //     for(int j=1;j<=i;j++){

        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // sc.close();



    }
}
