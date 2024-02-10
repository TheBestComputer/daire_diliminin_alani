
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14, alan;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dairenin yaricapini giriniz : ");
        r = scanner.nextInt();
        System.out.print("Dairenin merkez acisini giriniz : ");
        alfa = scanner.nextInt();
        
        alan = (pi * (r * r) * alfa) / 360;
        
        System.out.println("Daire diliminin alani : " + alan);
        
    }
}
