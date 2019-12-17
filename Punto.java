
public class Punto {
	// atributos y definen el estado de un objeto de la clase Punto
	private double x;
	private double y;
	
	Punto () // constructor por defecto de la clase Punto
	{
		x = 0.0;
		y = 0.0;
	}
	Punto (double valorX, double valorY) //constructor "natural"
	    // cuando construyo así, paso unos valores que se guarnda
		// en los atributos.
	{
		x = valorX;
		y = valorY;
	}
	public double getX()
	{
		return x; //devuelvo el valor del atributo x ==> this.x
	}
	public double getY()
	{
		return y; //devuelvo el valor del atributo x ==> this.x
	}
	public void setX (double valorX)
	{
		x = valorX;
	}
	public void setY (double valorY)
	{
		y = valorY;
	}
	public String aTexto()
	{
		return "la x: " + x + " y la y:" + y;
	}
}

