
public class division 
{
	public double dividir(double numero1, double num2)
	{
		double resultado = 0;
		if(num2 == 0)
		{
			System.out.println("No es posible dividir por 0");
		}
		else
		{
			resultado = numero1/num2;
			
		}
		return resultado;
	}
}
