
public class Reloj {
	private Horario h;
	private Fecha f;
	
	
	public Reloj() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reloj(Horario h, Fecha f) {
		super();
		this.h = h;
		this.f = f;
	}


	public Horario getH() {
		return h;
	}


	public void setH(Horario h) {
		this.h = h;
	}


	public Fecha getF() {
		return f;
	}


	public void setF(Fecha f) {
		this.f = f;
	}


	@Override
	public String toString() {
		return "Reloj [h=" + h + ", f=" + f + "]";
	}
	
	
}
