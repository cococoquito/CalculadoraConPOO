import javax.swing.JOptionPane;
// no hay documentacion, porfa mire bien como se documenta las clases variables y metodo
// por estandar POO siempre las clases deben empezar con minuscula (Division)
public class resta 
{
	// el metodo debe retornar el resultado
	public void restar(double num1,double num2)
	{
		double resultado = num1-num2;
		// esta clase debe tener la responsabilidad de hacer la - no de mostrar ningun mensaje
		JOptionPane.showMessageDialog(null, "Su resta es: "+resultado);
	}
}
