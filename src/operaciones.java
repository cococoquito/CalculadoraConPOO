import javax.swing.JOptionPane;


public class operaciones {
	
	

	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null,"Hola amigos");
		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese n�mero 1:"));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese n�mero 2:"));;
		String operacion = JOptionPane.showInputDialog("�Qu� operaci�n desea realizar"
				+"\n"+"1.Suma"
				+"\n"+"2.Resta"
				+"\n"+"3.Multipliaci�n"
				+"\n"+"4.Divisi�n");
		
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
			JOptionPane.showMessageDialog(null,"Su divisi�n es: "+result);
		}
		
			
	}

}
