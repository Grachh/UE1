//  DOCUMENTACI�N DEL PROGRAMA  -------------------------------------
/*
  ARCHIVO: UE3_A4.java
  EFECTO: Problemas de soluci�n directa con funciones.
  AUTOR: JMB
  GRUPO: 1O5M
  FECHA_CREACI�N:  1/11/2010
  FECHA_�LTIMA_MODIFICACI�N:  5/11/2010
*/

//  USO: UE3_A4 ue34 = new UE3_A4 ()

class Libreria
{
  
//  DECLARACIONES DE CONSTANTES  ------------------------------------ 
  
  static final double G = 6.67428e-11;

//  DECLARACION DE FUNCIONES  ---------------------------------------
  

  static int cifraI (int i , int n)
  {
    final int base = 10;
    return (n/(int)Math.pow(base,i-1)) % base;
  }

  public static boolean esMultiplo (int m , int n)
  {
    return (m % n) == 0;
  }

  public static int mayor2 (int m , int n)
  {
    return (m + n + Math.abs (m-n)) / 2;
  }

  public static int menor2 (int m , int n)
  {
    return (m + n - Math.abs (m-n)) / 2;
  }

  public static char aMayuscula (char letra)
  {
    return (char)(letra - 'a' + 'A');
  }

  public static char aMinuscula (char letra)
  {
    return (char)(letra - 'A' + 'a');
  }

  public static int aDigito (char letra)
  {
     final char nueve = '9';
     return nueve - '0';
  }

  public static boolean implicacion (boolean p, boolean q)
  {
    return !p || q;
  }

  public static boolean xor (boolean p, boolean q)
  {
     return (p && !q) || (!p && q);
  }

  public static boolean bicondicional (boolean p, boolean q)
  {
     return !xor(p,q);
  }

//  DECLARACIONES DE PRUEBAS  ---------------------------------------

}