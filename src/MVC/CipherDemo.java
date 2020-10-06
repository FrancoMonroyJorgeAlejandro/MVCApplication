
package MVC;



public class CipherDemo
{
public static void main ( String [] args )
{
Modelo m = new Modelo () ;
Vista v = new Vista () ;
Controlador c = new Controlador (m, v) ;
c. arrancar () ;
}
}