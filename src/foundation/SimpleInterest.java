package foundation;
import java.util.Scanner;
public class fol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("this is a calculater program for si ");
        int p = scanner.nextInt();
        int r = scanner.nextInt();  
        int t = scanner.nextInt();
        int si = (p * r * t) / 100;
        System.out.println("the simple interest is  " + si );
        scanner.close();
    }

}
