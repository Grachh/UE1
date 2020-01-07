
public class EjemplosReloj {

	public static void main(String[] args) {

		
		
		
		
		Fecha f1 = new Fecha (17,8,1985);
		Fecha f2 = new Fecha (20,2,2020);
	    boolean esMenor = LibFechas.esAnterior (f1,f2);
		System.out.println ("Es fecha menor? : " + esMenor);
		Horario h1 = new Horario (30,10,10);
		Horario h2 = new Horario (20,20,20);
		esMenor = LibHorarios.esAnterior (h1,h2);
		System.out.println ("Es horario menor? : " +esMenor);
		Reloj r1 = new Reloj (h1,f1);
		Reloj r2 = new Reloj (h2,f2);
		Reloj r3 = new Reloj (h1,f2);
		r3.getF().setAnio(2022);
		System.out.println ("Reloj 1:" + r1);
		System.out.println ("Reloj 2:" + r2);
		System.out.println ("Reloj 3:" + r3);
				esMenor = LibReloj.esAnterior (r1,r2);
		System.out.println ("Es reloj menor? : " +esMenor);
//		boolean esMenor = h.menorOIgual (g);
	
	
	}

}
