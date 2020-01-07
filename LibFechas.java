import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

// Libería con clase Fecha

public class LibFechas {

	//  DECLARACIONES DE CONSTANTES  ------------------------------------ 

	static final int segundosHora = 3600;
	static final int segundosMinuto = 60;


	public static boolean anyoBisiesto (Fecha f)
	{
		return ((f.getAnio() % 4 == 0) && (f.getAnio() % 100 != 0)) || (f.getAnio() % 400 == 0);
	}

	public static int diasDelMes (Fecha f)
	{
		switch (f.getMes())
		{
		case 4: case 6 :
		case 9: case 11: return 30;
		case 2         : if (anyoBisiesto (f))
			return 29;
		else
			return 28;
		default        : return 31;
		}
	}
	
	public static Fecha siguienteFecha (Fecha fecha)
	  {
		int dia = fecha.getDia();
		int mes = fecha.getMes();
		int anio = fecha.getAnio();
	    if (dia < diasDelMes (fecha))
	      return new Fecha (dia+1, mes, anio);
	    else if (mes < 12)
	      return new Fecha (1,mes+1, anio);
	    else
	      return new Fecha (1,1,anio+1);
	  }
	
	public static boolean anioCorrecto (Fecha f)
	{
		return f.getAnio() >= 1 && f.getAnio() < 3000;
	}

	public static boolean mesCorrecto (Fecha f)
	{
		return (f.getMes() >= 1) && (f.getMes() <= 12);
	}

	public static boolean diaCorrecto (Fecha f)
	{
		return (f.getDia() >= 1) && (f.getDia() <= diasDelMes (f));
	}

	public static boolean fechaCorrecta (Fecha f)
	{
		return anioCorrecto (f) && mesCorrecto (f) &&
				diaCorrecto (f);
	}

	public static boolean esAnterior (Fecha f1, Fecha f2)
	{
		final boolean mismoAnio = f1.getAnio() == f2.getAnio();
		final boolean mismoMes = f1.getMes() == f2.getMes();
		return (f1.getAnio()) < f2.getAnio() ||
				(mismoAnio && (f1.getMes() < f2.getMes())) ||
				(mismoAnio && mismoMes && (f1.getDia() < f2.getDia()));
	}
	
}