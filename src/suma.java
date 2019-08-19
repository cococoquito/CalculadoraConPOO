import javax.swing.JOptionPane;
// no hay documentacion, porfa mire bien como se documenta las clases variables y metodo
// por estandar POO siempre las clases deben empezar con minuscula (Division)
public class suma 
{
	// metodo debe retornar el resultado
	public void sumar(double numero1, double numero2)
	{
		// no hay necesidad de crear una variable resultado
		double resultado;
		resultado = numero1+numero2;
		// esta clase debe tener la responsabilidad de hacer la + no de mostrar ningun mensaje
		JOptionPane.showMessageDialog(null,"La suma es: "+resultado);
		
	}
}
