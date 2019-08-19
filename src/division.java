// no hay documentacion, porfa mire bien como se documenta las clases variables y metodo
// por estandar POO siempre las clases deben empezar con minuscula (Division)

public class division 0
{// las llaves siempre se abre al lado del nombre "public class Division {"
	public double dividir(double numero1, double num2)
	{// las llaves siempre se abre al lado del nombre "public double dividir {"
		double resultado = 0;
		if(num2 == 0)
		{
			// esta clase debe tener la responsabilidad de hacer la division no de mostrar ningun mensaje
			System.out.println("No es posible dividir por 0");
		}
		else
		{
			resultado = numero1/num2;
			
		}
		return resultado;
	}
}
