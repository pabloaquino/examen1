package gt.edu.url.examen1.impl;

import java.util.Scanner;

import gt.edu.url.examen1.api.CalculoPI;
import gt.edu.url.examen1.api.Chudnovsky;
/**
 *
 * @author tuxtor
 */
public class Main {
	static CalculoPI miclase = new CalculoPI(0);
	
    public static void main(String[] args) {
    	System.out.println("Examen 2");
    	Scanner Sc = new Scanner(System.in);
    	System.out.println("Ingrese el numero de ciclos para calcular el valor de PI");
    	int k = 0;
    	k = Sc.nextInt();
    	Main main = new Main();
    	main.Iniciar(k);
    	
    	miclase.calcularPi(k);
    	
    	System.out.println(miclase.calcularPi(k));
    	
    }
    
    public void Iniciar(int k) {
    	CalculoPI pi = new CalculoPI(k);    
    }
    
}
