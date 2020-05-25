import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int width = 0;
        while(width < number){
            for (int i = 0; i < number-width-1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < width*2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println();
            width++;
        }
        in.close();
    }
}
