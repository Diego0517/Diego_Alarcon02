import java.util.Random;
import java.util.Scanner;
public class AdivinaElNumero{

public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Random random = new Random();    
 int numeroAleatorio = random.nextInt(100) + 1;
 int intentos= 0;
 int adivinanza= 0;
 System.out.println("Adivina el numero");

 while (adivinanza != numeroAleatorio){
    System.out.print( "Dame un numero: ");
    adivinanza = scanner.nextInt();
    intentos++;
    if (adivinanza < numeroAleatorio) {
    System.out.println( "El numero es mayor");
    } else if ( adivinanza > numeroAleatorio) {
    System.out.println("El numero es menor");  
    }else{
    System.out.println("¡¡¡ADIVINASTE EL NUMERO!!! "); 
    System.out.println("Lo lograste en " + intentos + " intentos");
    }
  }
 }   
}
