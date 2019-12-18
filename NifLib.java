import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NifLib {
	private static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";

	/**
	 * Devuelve un NIF completo a partir de un DNI. Es decir, añade la letra del NIF
	 * @param dni dni al que se quiere añadir la letra del NIF
	 * @return NIF completo.
	 */
	public static String nifFromDni (int dni) {
		return String.valueOf(dni) + NIF_STRING_ASOCIATION.charAt(dni % 23);
	}
	
	public static char letraDNI(int dni) {
		return NIF_STRING_ASOCIATION.charAt(dni % 23);
	}
	
	public static boolean validarNif(Nif nif){
		return validarNif (String.valueOf(nif.getNumero()) + nif.getLetra()); 
	}
	
	public static boolean validarNif(String nif){
		boolean correcto=false;
		Pattern pattern=Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
		Matcher matcher=pattern.matcher(nif);
		if(matcher.matches()){
			String letra=matcher.group(2);
			String letras="TRWAGMYFPDXBNJZSQVHLCKE";
			int index=Integer.parseInt(matcher.group(1));
			index=index%23;
			String reference=letras.substring(index,index+1);
			if(reference.equalsIgnoreCase(letra)){
				correcto=true;
			}else{
				correcto=false;
			}
		}else{
			correcto=false;
		}
		return correcto;
	}
}
