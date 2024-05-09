/* 5.- Realice un diagrama que calcule los logaritmos decimal y neperiano de los números comprendidos entre 1 y 100, con intervalos de 5 en 5. Debe importar la librería Math en Java. La función que calcula el logaritmo decimal es Math.log(d) / Math.log(10) siendo d un número cualquiera, y la que calcula el logaritmo neperiano es Math.log(d). La salida por pantalla debe ser similar a ésta: Este diagrama calcula el logaritmo decimal el logaritmo neperiano de los números entre el uno y el 100, de 5 en 5. 
Sacchetti, Maria Giselle C2*/

import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = 1;
    while (num <= 100) {

      double logaDecimal = Math.log(num) / Math.log(10);
      double logaNeperiano = Math.log(num);

      System.out.printf("El logaritmo decimal de %d es: %.2f\n", num, logaDecimal);
      System.out.printf("El logaritmo neperiano de %d es: %.2f\n", num, logaNeperiano);

      num = num + 5;
    }
    scanner.close();
  }

}