
public class Ejemple1 {
	
	static public double areaTriangulo (double base, double altura)
	  {
	    return (base*altura)/2;
	  }
	
	static public double longitudCircunferencia (double radio)
	{
	   return 2 * Math.PI * radio;
	 }
	
	public static void main(String[] args) {
		
		//  DECLARACIONES DE CONSTANTES  ------------------------------------ 
		  
		  final double unMedio = 1/2;
		  final double c = 3e5;
		  final int diasSemana = 7;
		  final int segundosHora = 3600;
		  final double avogadro = 6.022E23;
		  final double masaTierra = 5.97e24;
		  final double g = 9.780327;
		  final String miNombre = "JMB";
		      
		//  DECLARACIONES DE PRUEBAS  ---------------------------------------

		  int radio = 5;
		 
		  
		  double base = 21.3;
		  double altura = 6.0;
		  double base2 = 21.3;
		  double altura2 = 6.0;
		  double valrareaTriangulo = areaTriangulo(base,altura);
		  double valrareaTriangulo2 = areaTriangulo(0.22,12.1);

		  
		  int dias = 243;
		  int semanasDe = dias / diasSemana;
		  double prueba13 = semanasDe;
		  
		  int horarioEnSegundos = 72260;
		  int horas = horarioEnSegundos / segundosHora;
		  int minutos = (horarioEnSegundos % segundosHora) / 60;
		  int segundos = (horarioEnSegundos % segundosHora) % 60;
		  int prueba14_1 = horas;
		  int prueba14_2 = minutos;
		  int prueba14_3 = segundos;
		  
		  double dolares = 2200;
		  double cambioEuroADolar = 1.3914;
		  double euros = dolares / cambioEuroADolar;
		  double prueba15 = euros;
		  
		  double masaCuerpo = 6.63e8;
		  double distancia = 4e7;
		  final double G = 6.67428e-11;
		  double fuerzaAtraccion = (G * masaCuerpo * masaTierra) /
		                           (distancia * distancia);
		  double prueba16 = fuerzaAtraccion;
		  
		  int x = 1042;
		  int cifra = 1;
		  int digito = (x/(int)Math.pow(10,cifra-1)) % 10;
		  int prueba17 = digito;
		  
		  double y = 1024.24;
		  int parteEntera = (int) y;
		  double parteDecimal = y - parteEntera;
		  double prueba18 = parteDecimal;
		  
		  int primero = 4;
		  int razon = 7;
		  int vigesimo = primero + (20 - 1) * razon;
		  int suma20primeros = ((primero + vigesimo) * 20) / 2;
		  int prueba19 = suma20primeros;
		  
		  double m1 = 6;
		  double m2 = 5;
		  // 24º39' en decimal es 24,65
		  double angulo = 24.65;
		  double sumaVectores = Math.sqrt(m1*m1 + m2*m2 +
		                                  2*m1*m2*Math.cos (24.65));
		  double prueba110 = sumaVectores;

		  System.out.println(areaTriangulo(0.22,12.1));
		  System.out.println(areaTriangulo(8.22,12.1));

	}
}
