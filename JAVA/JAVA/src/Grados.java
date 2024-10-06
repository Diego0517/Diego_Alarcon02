import java.util.Scanner;
public class Grados 
{
    public static float convierteCentigradosAFahrenheit (float gradosCentigrados){
     return 32 + ( 9 * gradosCentigrados / 5);
  }
    public static void main(String[] args) throws Exception {     
Scanner scanner = new Scanner(System.in);
float gradosCentigrados = scanner.nextFloat();
System.out.println(convierteCentigradosAFahrenheit(gradosCentigrados));
  }
}


