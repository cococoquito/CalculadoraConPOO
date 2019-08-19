import javax.swing.JOptionPane;

// no hay documentacion, porfa mire bien como se documenta las clases variables y metodo
// por estandar POO siempre las clases deben empezar con minuscula (Division)
public class operaciones {
	
	
	// esta es la clase encargada de obtener y mostrar los datos (vista)
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null,"Hola mundo");
		
		// se debe validar la entrada de los datos que efectivamente sean numericos
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 1:"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese número 2:"));;
		String operacion = JOptionPane.showInputDialog("¿Qué operación desea realizar"
				+"\n"+"1.Suma"
				+"\n"+"2.Resta"
				+"\n"+"3.Multipliación"
				+"\n"+"4.División");
		
		// despues de dos o tres if consecutivo es preferible utiliza switch
		// esto es logica del negocio, esta clase no debe tener logica del negocio ya que es
		// solamente encargada de recuperar datos, hacer el llamdo al business y motrar el resultado
		// se debe crear otra clase que es la encargada de centralizar todo el proceso de negocio 
		// se podria llamar (Calculadora) ahi debe tener esta logica y esta clase solamente hace el llamado a 
		// un metodo de esa clase que podria ser (Calculadora.calcular(double nro1, double nro2, String operacion))
		if(operacion.equals("1"))
		{
			suma miSuma = new suma();
			miSuma.sumar(numero1,numero2);
		}
		
		else if(operacion.equals("2"))
		{
			resta miResta = new resta();
			miResta.restar(numero1,numero2);
		}
		
		else if(operacion.equals("3"))
		{
			multiplicacion mult = new multiplicacion();
			mult.multiplicar(numero1,numero2);
		}
		
		else if(operacion.equals("4"))
		{
			division miDivision = new division();
			double result = miDivision.dividir(numero1,numero2);
			JOptionPane.showMessageDialog(null,"Su división es: "+result);
		}
		
			
	}

}
