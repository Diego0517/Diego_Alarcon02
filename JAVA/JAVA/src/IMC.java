import java.util.Scanner;
public class IMC {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce tu peso:");
    double peso = scanner.nextDouble();
    System.out.println("Introduce tu altura:");
    double altura = scanner.nextDouble();
    double IMC = peso/(altura*altura);
System.out.println("Tu IMC es " + IMC);

if (IMC < 18.5) {
    System.out.println("Tu nivel de peso es Bajo");
 }else if (IMC >= 18.5 && IMC < 24.9){   
    System.out.println("Tu nivel de peso es Saludable");
} else if (IMC >= 25 && IMC < 29.9) {
    System.out.println("Tu nivel de peso es Sobrepeso");
} else {
    System.out.println("Tu nivel de peso es Obesidad");
} scanner.close();
 }   
}

