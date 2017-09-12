package gt.edu.url.examen1.api;

public class CalculoPI {

	int repeticiones;
	public CalculoPI(int k) 
	{
		repeticiones = k;
	}
	public  double calcularPi(int k)
	{       
	    if(k==0)
	        return Pi(k);
	    else {
	        double resultado= (Pi(k))+(Pi(k-1));
	        return (int)resultado;
	    }

	}

	public double Pi(int k)
	{
	    double numerador=(factorial(6*k)*((545140134*k)+13591409));
	    double denominador =(factorial(3*k)*Math.pow(factorial(k), 3)*Math.pow(-640320, (3*k)));
	    double Pi=(numerador/denominador);
	    return Pi;
	}

	 public double factorial(int n)// This is a class to calculate an factorial of a number
	 {
	    if (n==0)
	       return 1;
	    else
	       return n*(factorial(n-1));
	}
}
