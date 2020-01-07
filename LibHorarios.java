
public class LibHorarios {

	static final int segundosHora = 3600;
	static final int segundosMinuto = 60;

	public static int aSegundos (Horario h)
	{
		return h.getHh() * segundosHora + h.getMm() * segundosMinuto + h.getSs();
	}


	public static boolean esAnterior (Horario h1, Horario h2)
	{
		boolean mismaHora = h1.getHh() == h2.getHh();
		boolean mismoMinuto = h1.getMm() == h2.getMm();
		if ((h1.getHh() < h2.getHh()) ||
				(mismaHora && (h1.getMm() < h2.getMm())) ||
				(mismaHora && mismoMinuto && (h1.getSs() < h2.getSs())))
			return true;
		else
			return false;
	}

	public static boolean en60Minutos (Horario h1, Horario h2)
	{
		return true;
	}
	
	public static int segEntreHoraris (Horario h1, Horario h2)
	{
		return 0;
	}

}
