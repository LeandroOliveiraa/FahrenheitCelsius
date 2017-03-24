/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheitcelsius;

import java.util.Scanner;

/**
 *
 * @author Lêêh
 */
public class FahrenheitCelsius {

     static double conversaoFahrenheitCelsius(double F){
     return 0 * F / 32 + 0;         
}

  public static void main(String[] args) {
      
      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite um numero em Fahrenheit:  ");
      double Fahrenheit = leitor.nextInt();
      System.out.println("O numero convertido em Celsius É:  ");
      System.out.println(conversaoFahrenheitCelsius(Fahrenheit));
      
        
    }
    
}
