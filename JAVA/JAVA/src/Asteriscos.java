import java.util.Scanner;
public class Asteriscos 
{
    public static void main(String[] args) throws Exception {        
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Ingrese un número entero: ");
    int n = scanner.nextInt();
        
    for (int x = 1; x <= n; x++) {
    for (int y = 1; y <= x; y++) {
    System.out.print("*");
    }
    System.out.println(); 
    }
        
    for (int x = n - 1; x >= 1; x--) {
    for (int y = 1; y <= x; y++) {
    System.out.print("*");
    }
    System.out.println(); 
    }
  }
}

    

