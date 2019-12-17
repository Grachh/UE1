
class UE4_A4
{
  
//  DECLARACIONES DE CONSTANTES  ------------------------------------ 
  
  final double pi = 3.141591;
  final int segundosHora = 3600;
  final int segundosMinuto = 60;


  public static boolean anyoBisiesto (int anyo)
  {
    return ((anyo % 4 == 0) && (anyo % 100 != 0)) || (anyo % 400 == 0);
  }

  public static int diasDelMes (int mes, int anyo)
  {
    switch (mes)
    {
      case 4: case 6 :
      case 9: case 11: return 30;
      case 2         : if (anyoBisiesto (anyo))
                         return 29;
                       else
                         return 28;
      default        : return 31;
    }
  }
  public static boolean anioCorrecto (int anio)
  {
	  return anio >= 1 && anio < 3000;
  }
 
  boolean mesCorrecto (int mes)
  {
      return (mes >= 1) && (mes <= 12);
  }
  
  boolean diaCorrecto (int dia, int mes, int anyo)
  {
    return (dia >= 1) && (dia <= diasDelMes (mes,anyo));
  }
  
  
  
  
  
  


  boolean fechaCorrecta (int dia, int mes, int anyo)
  {
    return anioCorrecto (anyo) && mesCorrecto (mes) &&
           diaCorrecto (dia,mes,anyo);
  }
  
  
  int aSegundos (int hh, int mm, int ss)
  {
    return hh * segundosHora + mm * segundosMinuto + ss;
  }

  boolean esAnterior (int hh1, int mm1, int ss1,
                      int hh2, int mm2, int ss2)
  {
    final boolean mismaHora = hh1 == hh2;
    final boolean mismoMinuto = mm1 == mm2;
    return (hh1 < hh2) ||
           (mismaHora && (mm1 < mm2)) ||
           (mismaHora && mismoMinuto && (ss1 < ss2));
  }

  boolean en60Minutos (int hh1, int mm1, int ss1,
                       int hh2, int mm2, int ss2)
  {
    if (esAnterior (hh1,mm1,ss1,hh2,mm2,ss2))
      return ((hh1 + 1) > hh2) ||
             (((hh1 + 1) == hh2) && (mm1 > mm2)) ||
             (((hh1 + 1) == hh2) && (mm1 == mm2) && (ss1 > ss2));
    else
      return ((hh2 + 1) > hh1) ||
             (((hh2 + 1) == hh1) && (mm2 > mm1)) ||
             (((hh2 + 1) == hh1) && (mm2 == mm1) && (ss2 > ss1));
  }

  boolean enLosMismos60Minutos (int hh1, int mm1, int ss1,
                                int hh2, int mm2, int ss2)
  {
    if (((hh1 == 0) && (hh2 == 23)) || ((hh1 == 23) && (hh2 == 0)))
      return en60Minutos ((hh1+1)%24,mm1,ss1,(hh2+1)%24,mm2,ss2);
    else
      return en60Minutos (hh1,mm1,ss1,hh2,mm2,ss2);
  } 
}