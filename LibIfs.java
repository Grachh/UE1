

class LibIfs
{
  
//  DECLARACIONES DE CONSTANTES  ------------------------------------ 
  
  final double pi = 3.141591;

//  DECLARACION DE FUNCIONES  ---------------------------------------


  public static int valorAbsoluto (int x)
  {
    if (x >= 0)
      return x;
    else
      return -x;  
  }

  public static int max2 (int x, int y)
  {
    if (x >= y)
      return x;
    else
      return y;
  }
  
  public static double max2 (double x, double y)
  {
    if (x >= y)
      return x;
    else
      return y;
  }

  public static int max3Heavy (int x, int y, int z)
  {
    if ((x >= y) && (x >= z))
      return x;
    else if ((y >= x) && (y >= z))
      return y;
    else if ((z >= x) && (z >= y))
      return z;
    else  // Demasiadas preguntas. No hay nada que hacer 
      return z;
  }

  public static int max3Fino (int x, int y, int z)
  {
    if ((x >= y) && (x >= z))
      return x;
    else if (y >= z)
      return y;
    else
      return z;
  }

  int max3Cool (int x, int y, int z)
  {
    return max2 (max2 (x,y),z);
  }

  int anillosDigito (int d)
  {
    if (d == 8)
      return 2;
    else if ((d == 0) || (d == 6) || (d == 9))
      return 1;
    else
      return 0;
  }

  int anillosDigitoSwitch (int d)
  {
    switch (d)
    {
      case 8                : return 2;
      case 0: case 6: case 9: return 1;
      default               : return 0;
    }
  }

  int numSolucionesPolinomio (int a, int b, int c)
  {
    final int discriminante = b*b - 4*a*c;
    if (discriminante < 0)
      return 0;
    else if (discriminante > 0)
      return 2;
    else
      return 1;
  }

  int queCuadrante (double x, double y)
  {
    if (x > 0.0)
      if (y > 0.0)
        return 1;
      else
        return 4;
    else if (x < 0.0)
      if (y >= 0.0)
        return 2;
      else
        return 3;
    else if (y > 0.0)  //  x = 0
      return 1;
    else if (y < 0.0)
      return 3;
    else
      return 0;
  }

/
}