import java.util.Scanner;
public class LongRadio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el radio de la esfera: ");
    double radio = scanner.nextDouble();
    double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
    System.out.println("El volumen de la esfera es: " + volumen);
    scanner.close();
  }  
}
