import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int x = 1;
        int y = 1;

        while (x<=num){
            y=1;
            while (y<=num) {
                System.out.print("* ");
                y++;
            }
            System.out.println();
            x++;
        }

    }
}