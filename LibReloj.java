
public class LibReloj {

	public static boolean esAnterior (Reloj r1, Reloj r2){
		final boolean mismaFecha = r1.getF().equals(r2.getF());
		return 
			(LibFechas.esAnterior(r1.getF(),r2.getF()) ||
			(mismaFecha && LibHorarios.esAnterior(r1.getH(),r2.getH())));
	}
	
	

}
