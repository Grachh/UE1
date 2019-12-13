/*
 * FORMA DE USO:
 * 1. Abrir el archivo en DrJava
 * 2. Compilar el archivo
 * 3. En el panel de Interations escribir: 
            > UE2_A2 ue22 = new UE2_A2 ()
 * 4. Comprobar valores de las constantes y pruebas: 
            > ue22.cierto
            true
            > ue22.prueba11
            -6
            > ... etc...
*/
//  DOCUMENTACIÓN DEL PROGRAMA  -------------------------------------
/*
  ARCHIVO: UE2_A2.java
  EFECTO: Lectura de expresiones de tipos básicos.
  AUTOR: JMB
  GRUPO: 1O5M
  FECHA_CREACIÓN:  1/11/2010
  FECHA_ÚLTIMA_MODIFICACIÓN:  2/11/2010
*/

class UE2_A2
{
  
//  DECLARACIONES DE CONSTANTES  ------------------------------------
  
  final boolean   cierto = true;
  final boolean   falso = false;
  final char       cero = '0';
  final char          a = 'a';
  final int  diasSemana = 7;
  final int   añoActual = 2010;
  final double       PI = 3.141593;
  final double avogadro = 6.022E23;
  final String    grupo = "1O5M";
  final String     aula = "Verdes+Monge";
    
//  DECLARACIONES DE PRUEBAS  ---------------------------------------

  int           x = 8;
  int    prueba11 = -Math.abs (6);
  int    prueba12 = Math.abs (-6);
  double prueba13 = Math.pow (7,2);
  int    prueba14 = 7 % 4;
  int    prueba15 = 7 % 1;
  int    prueba16 = ++ x;
  int    prueba17 = -- x;
  
  double prueba21 = Math.pow (7,-2);
  double prueba22 = ++ x;
  double prueba23 = 0.07e+2 + 70.0e-1;
  double prueba24 = 7 / 7;
  double prueba25 = 7.0 / 7.0;
  double prueba26 = (double)(7 / 7);
  int    prueba27 = (int)PI;
  int    prueba28 = (int)Math.pow (7,2);
  
  boolean prueba31 = cierto && true;
  boolean prueba32 = cierto || falso;
  boolean prueba33 = cierto && ! falso;
  boolean prueba34 = falso && cierto || falso;
  boolean prueba35 = ! cierto && ! falso;
  boolean prueba36 = ! (cierto && ! falso);

  char prueba41 = cero + 1; 
  char prueba42 = '3' - 1;
  int  prueba43 = (int) cero; 
  char prueba44 = (char) prueba43;
  char prueba45 = (char) (prueba43 + 3);
  int  prueba46 = (int) 'a';
  int  prueba47 = (int) 'A';

  boolean prueba51 = cierto == true;
  boolean prueba52 = true != false;
  boolean prueba53 = a < 'b';
  boolean prueba54 = 'A' > a;
  boolean prueba55 =  PI >= 3.15;
  boolean prueba56 = (1.0 / 7.0) == (1.0 / 7.0);

}