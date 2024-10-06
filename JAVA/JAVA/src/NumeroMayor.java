import java.util.Scanner;
public class NumeroMayor {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el 1er numero: ");
    int num1 = scanner.nextInt();
 System.out.println("Ingresa el 2do numero: ");
    int num2 = scanner.nextInt();
    System.out.println("Ingresa el 3er numero: ");
    int num3 = scanner.nextInt();

    int mayor = num1;
    if (num2 > mayor){
    mayor = num2;
    }
    if (num3 > mayor) {
    mayor = num3;    
      }
    System.out.println("El numero mayor es " + mayor);
  }   
}

